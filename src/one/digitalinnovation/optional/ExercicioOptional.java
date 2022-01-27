package one.digitalinnovation.optional;

import java.util.Optional;

public class ExercicioOptional {

    public static void main(String[] args) {

        Optional<String> optionalPresente = Optional.of("Valor opcional");
        optionalPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));
        if (optionalPresente.isPresent()){
            String valor = optionalPresente.get();
        }

        optionalPresente.map((valor) -> valor.concat("****")).ifPresent(System.out::println);


        Optional<String> emptyOptional = Optional.empty();

        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));
        emptyOptional.orElseThrow(IllegalStateException::new);





        //Optional<String> optionalNull = Optional.of(null);



    }
}
