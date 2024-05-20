package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificarPositivos {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        boolean numeroPositivos = numeros.stream()
                .allMatch(i -> (i > 0));

        System.out.println("Pegue apenas os números pares e some: " + numeroPositivos);
        System.out.println(numeros);


    }

}
