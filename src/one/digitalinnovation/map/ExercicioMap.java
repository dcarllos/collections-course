package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.TreeMap;

public class ExercicioMap {
    public static void main(String[] args) {
        TreeMap<String, String> estados = new TreeMap<>();

        estados.put("AC", "Acre");
        estados.put("Al", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("SE", "Sergipe");
        estados.put("TO", "Tocantins");

        System.out.println(estados);

        //Remova o Estado de Minas Gerais
        estados.remove("MG");

        System.out.println(estados);

        //Adicione o Distrito Federal
        estados.put("DF", "Distrito Federal");

        System.out.println(estados);

        //Verifique o tamanho da mapa
        System.out.println(estados.size());

        //Remova o Estado do Mato Grosso do Sul usando o nome
        estados.remove("MS", "Mato Grosso do Sul");
        System.out.println(estados);


        //Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME (SIGLA)
        for (String foreach : estados.keySet()){
            System.out.println(estados.get(foreach) + " (" +foreach + ")");
        }

        //Verifique se o Estado de Santa Catarina existe no map buscando por sua sigla (SC)
        System.out.println(estados.containsKey("SC"));

        //Verifique se o Estado do Maranhão existe no map buscando por seu nome
        System.out.println(estados.containsValue("Maranhão"));

















    }
}
