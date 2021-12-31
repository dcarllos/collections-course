package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercicioList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println(nomes);

        System.out.println("Navegue na lista exibindo cada nome no console: ");
        //Com o foreach
        /*for (String listaNomes: nomes){
            System.out.println(listaNomes);
        }*/

        //Com o Iterator
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Subistitua o nome Carlos por Roberto: ");
        nomes.set(2, "Roberto");
        System.out.println(nomes);

        System.out.println("Retorne o nome da posição 1: " + nomes.get(1));
        System.out.println("Retorne o nome da posição 4: " + nomes.get(4));

        System.out.println("Remova o nome João: ");
        nomes.remove("João");
        System.out.println(nomes);

        System.out.println("Retorne a quantidade de ites na Lista: "+ nomes.size());

        System.out.println("Verifique se o nome Juliano existe na lista: " +nomes.contains("Juliano"));

        System.out.println("Crie uma nova lista com os nomes: Ismael e Rodrigo.");
        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");

        System.out.println("Adicione todos os itens da nova lista na primeira lista criada: ");
        nomes.addAll(nomes2);
        System.out.println(nomes);

        System.out.println("Ordene os itens da lista por ordem alfabética");
        Collections.sort(nomes);

        System.out.println(nomes);










    }
}
