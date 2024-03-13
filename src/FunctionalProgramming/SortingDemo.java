package FunctionalProgramming;

import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    public static void main(String[] args) {

        //sortingAsc(List.of("Allwyn", "Samu", "Jiji", "Mummy"));
        //sortingDSC(List.of("Allwyn", "Samu", "Jiji", "Mummy"));
        lengthSorting(List.of("Allwyn", "Samu", "Jiji", "Mummy"));

    }

    private static void lengthSorting(List<String> names) {

        //Asc
        names.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
        //DSC
        names.stream().sorted(Comparator.comparingInt(String::length).reversed()).forEach(System.out::println);
    }

    private static void sortingDSC(List<String> names) {

        names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void sortingAsc(List<String> names) {

        names.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}
