package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";

        List<String> listaSaudacao = Stream.generate(() ->  "Olá, seja bem-vindo(a)")
                .limit(2 )
                .toList();

        listaSaudacao.forEach(System.out::println);
    }
}
