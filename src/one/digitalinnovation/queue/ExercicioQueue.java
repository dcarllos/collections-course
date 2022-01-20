package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {
    public static void main(String[] args) {
        Queue<String> filaNomes = new LinkedList<>();
        filaNomes.add("Juliana");
        filaNomes.add("Pedro");
        filaNomes.add("Carlos");
        filaNomes.add("Larissa");
        filaNomes.add("João");

        System.out.println("\n Navega na fila e exibe os nomes: ");
        for (String nome : filaNomes ){
            System.out.println(nome);
        }

        String primeiroNome = filaNomes.peek();
        System.out.println("\n Primeiro nome da fila: " +primeiroNome);

        System.out.println("\n Retorna o primeiro nome removendo-o: ");
        System.out.println(filaNomes.poll());

        System.out.println(filaNomes);

        filaNomes.add("Daniel");
        System.out.println("\nPosição do nome Daniel na fila: " + filaNomes);

        System.out.println("\nTamanho da fila: " + filaNomes.size());

        System.out.println("\n Verifica se a fila está vazia: " + filaNomes.isEmpty());

        System.out.println("\n Verifica se o nome Carlos está na fila: " + filaNomes.contains("Carlos"));

    }
}
