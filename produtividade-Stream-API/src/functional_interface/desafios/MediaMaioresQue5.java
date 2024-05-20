package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class MediaMaioresQue5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double media = numeros.stream()
                .filter(i -> i > 5)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();

        System.out.println(media);
    }
}