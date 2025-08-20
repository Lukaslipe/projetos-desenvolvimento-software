public class Main {
    public static void main(String[] args) {

        Substracao sub = new Substracao();
        sub.descricao();
        System.out.println(sub.executar(10, 2));

        Multiplicacao mult = new Multiplicacao();
        mult.descricao();
        System.out.println(mult.executar(2, 5));

        Divisao div = new Divisao();
        div.descricao();
        System.out.println(div.executar(10, 2));

        Soma soma = new Soma();
        soma.descricao();
        System.out.println(soma.executar(10, 2));
    }
}