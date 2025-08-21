import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomesList = new ArrayList<>();
        nomesList.add("Lucas");
        nomesList.add("Eloisa");

        //System.out.println(nomesList);
        nomesList.remove("Eloisa");
        //System.out.println(nomesList);

        //System.out.println(nomesList.get(0));
        //System.out.println(nomesList.contains("Lucas"));

        Set<String> mySet = new HashSet<String>();
        mySet.add("Lucas");
        mySet.add("Lucas");

        //System.out.println(mySet);
        //System.out.println(mySet.contains("Lucas"));

        Map<Integer,String> myMap = new HashMap<>();
        myMap.put(1, "Eloisa");
        myMap.put(12, "Lucas");
        myMap.put(51, "BoaIdeia");
        //ystem.out.println(myMap);


        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for (int num : numeros){
            if (num % 2 == 0){
                //System.out.println(num);
            }
        }
        //System.out.println(numeros);

        Set<String> nomes = new HashSet<String>();
        nomes.addAll(Arrays.asList("Lucas", "Eloisa", "Miguel", "Laura"));
        String nomeRemove = "Eloisa";
        System.out.println(nomes);
        if(nomes.contains(nomeRemove)){
            nomes.remove(nomeRemove);
            System.out.println("O nome " + nomeRemove + " foi removido do array!");
        }else {
            System.out.println("O nome escolhido não está dentro do array!");
        }
        System.out.println(nomes);

        Map<String, Integer> produtos = new HashMap<>();
        produtos.put("Copo", 10);
        produtos.put("Caneca", 15);
        produtos.put("Prato", 20);
        produtos.put("Garfo", 5);

        for (Map.Entry<String, Integer> entry : produtos.entrySet()) {
            if (entry.getValue() > 10) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }

        ArrayList<String> nomesLista = new ArrayList<>();
        nomesLista.add("Lucas");
        nomesLista.add("Eloisa");
        nomesLista.add("Amanda");

        nomesLista.removeIf(nome -> nome.startsWith("A"));
        System.out.println(nomesLista);

    }
}