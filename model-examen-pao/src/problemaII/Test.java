package problemaII;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Automobil> automobile = Arrays.asList(
                new Automobil("Dacia", "Logan", 2000, 4000),
                new Automobil("Toyota", "Corolla", 2700, 21000),
                new Automobil("Volvo", "S6", 3200, 37000),
                new Automobil("Audi", "A6", 3500, 32000),
                new Automobil("Dacia", "Logan", 1800, 5500)
        );

        // 1
        automobile.stream()
                .filter(automobil -> automobil.getPret() >= 5000)
                .sorted(Comparator.comparing(Automobil::getPret).reversed())
                .forEach(System.out::println);

        // 2
        // daca vrem sa afisam doar marca
        automobile.stream()
                .map(Automobil::getMarca)
                .distinct()
                .forEach(System.out::println);

        // daca vrem sa afisam toate detaliile automobilelor
        automobile.stream()
                .collect(Collectors.groupingBy(Automobil::getMarca))
                .forEach((key, value) -> System.out.println(value.stream().findFirst().get()));

        // 3
        List<Automobil> result = automobile.stream()
                .filter(automobil -> automobil.getCapacitate() >= 2000 && automobil.getCapacitate() <= 3000)
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        // 4
        automobile.stream()
                .collect(Collectors.groupingBy(Automobil::getMarca))
                .forEach((marca, automobileByMarca) -> {
                    System.out.println("Marca: " + marca);
                    automobileByMarca
                            .forEach(automobil -> System.out.println(automobil.getModel()));
                    }
                );
    }
}
