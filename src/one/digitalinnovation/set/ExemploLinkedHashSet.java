package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adiciona os números no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //Remove o número do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        //Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        //Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()){
            System.out.println("\n iterator -->"+iterator.next());
        }

        for (Integer num : sequenciaNumerica){
            System.out.println("\n for -->" + num);
        }

        //Retorna se o set está vazio ou não
        System.out.println("\n O set está vazio? " + sequenciaNumerica.isEmpty());



    }
}
