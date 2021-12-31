package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);
        nomes.set(2, "Larissa");


        System.out.println(nomes);

        Collections.sort(nomes);
        nomes.set(2, "Wesley");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(nomes.size() -1);
        System.out.println(nome);

        int posicao = nomes.indexOf("Carlos");
        System.out.println("Posição do nome Carlos na lista: "+posicao);

        int posicao1 = nomes.indexOf("Wesley");
        System.out.println("Posição do nome Wesley na lista: "+posicao1);

        int tamanho = nomes.size();
        System.out.println("tamanho até aqui: " +tamanho);

        nomes.remove("Larissa");
        System.out.println("Remove a Larissa: " + nomes);
        tamanho = nomes.size();
        System.out.println("tamanho até aqui: " + tamanho);

        boolean temAnderson = nomes.contains("Anderson");
        System.out.println("Tem Anderson na Lista? "+temAnderson);

        boolean temFernando = nomes.contains("Fernando");
        System.out.println("Tem Fernando na Lista? "+temFernando);

        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia? " +listaEstaVazia);

        for(String nomeDoItem : nomes){
            System.out.println("-->" +nomeDoItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("---->" +iterator.next());
        }

        System.out.println("Limpando a Lista.");
        nomes.clear();

        boolean listaEstaVazia2 = nomes.isEmpty();
        System.out.println("A lista está vazia? " +listaEstaVazia2);







    }
}
















