package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RemoverImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numeroPare= numero -> numero % 2 == 0;

        List<Integer> nPar = numeros.stream()
                .filter(numeroPare)
                .toList();
        nPar.forEach(System.out::println);
    }
}
