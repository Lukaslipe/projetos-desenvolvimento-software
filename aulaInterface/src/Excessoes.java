import java.io.BufferedReader;
import java.io.FileReader;

public class Excessoes {
    public static void main(String[] args) {
        int x = 0;
        try {
            x = 7 / 2;
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println(x);

        String texto = "45";
        int y = 0;
        try {
            y = Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        System.out.println(y);

        String[] nomes = {"Lolozinha", "Ninet", "Majuela"};
        try {
            System.out.println(nomes[0]);
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getClass());
        } finally {
            System.out.println("Chamou o finally");
        }

        System.out.println("CONTINUOOOOU");

        int l;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("dados.txt"));
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
            l = 10 / num;
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Cabou a leitura do arquivo");
        }
    }
}
