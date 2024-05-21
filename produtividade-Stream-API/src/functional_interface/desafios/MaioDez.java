package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MaioDez {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,25);

        Predicate<Integer> maior = num -> num > 10;

            boolean existeMaiorQueDez = numeros.stream()
                    .anyMatch(maior);

          System.out.println(existeMaiorQueDez);

    }
}
