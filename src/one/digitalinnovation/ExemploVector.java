package one.digitalinnovation;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();
        //Adiciona 4 esportes no vetor
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Handebol");
        System.out.println(esportes);

        System.out.println("Altera o valor da posição 2 do vetor para PingPong: ");
        esportes.set(2, "Ping Pong");
        System.out.println(esportes);

        System.out.println("Remove o esporte da posição 2: ");
        esportes.remove(2);
        System.out.println(esportes);

        System.out.println("Remove o esporte Handebol do vetor: ");
        esportes.remove("Handebol");
        System.out.println(esportes);

        System.out.println("Retorna o primeiro item do vetor: " + esportes.get(0));

        System.out.println("Navega nos esportes com o foreach : ");
        for (String nomeDoEsporte: esportes){
            System.out.println(nomeDoEsporte);
        }

        System.out.println("Navega nos esportes com o iterator: ");

        Iterator<String> iterator = esportes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }








    }
}
