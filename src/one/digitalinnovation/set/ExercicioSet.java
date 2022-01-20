package one.digitalinnovation.set;

import java.util.*;

public class ExercicioSet {
    public static void main(String[] args) {

        /*Crie um Set e execute as seguintes operações:

        - Adicione 5 números inteiros: 3, 88, 20, 44, 3
        - Navegue no Set exibindo cada número no console.
        - Remova o primeiro item do Set.
        - Adicione um novo número no Set: 23.
        - Verifique o tamanho do Set.
        - Verifique se o Set está vazio.
        *
        * */

        //Adicione 5 números inteiros: 3, 88, 20, 44, 3
        TreeSet<Integer> numerosInteiros = new TreeSet<>();
        numerosInteiros.add(3);
        numerosInteiros.add(88);
        numerosInteiros.add(20);
        numerosInteiros.add(44);
        numerosInteiros.add(3);

        // Navegue no Set exibindo cada número no console.
        Iterator<Integer> iterator = numerosInteiros.iterator();
        while (iterator.hasNext()){
            System.out.println("-->"+ iterator.next());
        }

        //Remova o primeiro item do Set.
        numerosInteiros.pollFirst();

        System.out.println(numerosInteiros);

        //Adicione um novo número no Set: 23
        numerosInteiros.add(23);

        System.out.println(numerosInteiros);

        //Verifique o tamanho do Set
        System.out.println("\nTamanho do set: "+numerosInteiros.size());

        //Verifique se o Set está vazio
        System.out.println("\nO set está vazio? " + numerosInteiros.isEmpty());


        System.out.println();
    }
}
