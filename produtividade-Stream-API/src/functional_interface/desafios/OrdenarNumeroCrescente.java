package functional_interface.desafios;

import java.util.Arrays;
import java.util.List;

public class OrdenarNumeroCrescente {

    public static void main(String[] args) {

        List<Integer> ordenarNumeros = Arrays.asList(2,100,4, 5, 54,12, 10,8,77,45);

            ordenarNumeros.stream().sorted(Integer::compareTo)
                    .forEach(System.out::println);

    }
}
