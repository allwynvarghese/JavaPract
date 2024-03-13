package FunctionalProgramming;

import java.util.Arrays;
import java.util.List;

public class FP01Ex {



    public static void main(String[] args) {


        //Ex.1 print only odd numbers from the list
        printOnlyOddNums(List.of(1,2,3,4,5,6,7,8,9,10,12,13,14,15));

        //Ex.2 print all the courses individually
        printIndividualCourses(List.of("Spring", "Spring Boot", "API", "Microservices", "AMS", "PCF", "Azure"));

        //Ex.3 print courses containing spring
        printSpringCourses(List.of("Spring", "Spring Boot", "API", "Microservices", "AMS", "PCF", "Azure"));

        //Ex.4 print courses whose name has at least 4 letters
        printMoreThanFourCourse(List.of("Spring", "Spring Boot", "API", "Microservices", "AMS", "PCF", "Azure"));

        //Ex.5 Print the cube of odd numbers
        printOddCubes(List.of(1,2,3,4,5,6,7,8,9,10,12,13,14,15));

        //Ex.6 Print the number of characters in each course name
        printCharsInCourse(List.of("Spring", "Spring Boot", "API", "Microservices", "AMS", "PCF", "Azure"));

    }

    private static void printCharsInCourse(List<String> courses) {

        courses.stream().map(m->m.length()).forEach(System.out::println);
    }

    private static void printOddCubes(List<Integer> nums) {

        nums.stream()
                .filter(n->n%2==1)
                .map(m->m*m*m)
                .forEach(System.out::println);
    }

    private static void printMoreThanFourCourse(List<String> courses) {

        //filter and forEach methods
        courses.stream().filter(s->s.length()>4).forEach(System.out::println); //method reference in forEach
    }

    private static void printSpringCourses(List<String> springs) {

        springs.stream().filter(s->s.contains("Spring")).forEach(System.out::println);

    }

    private static void printIndividualCourses(List<String> courses) {

        courses.stream().forEach(System.out::println);
    }

    private static void printOnlyOddNums(List<Integer> nums) {

        nums.stream()
                .filter(num->num%2!=0)
                .forEach(System.out::println);
    }
}
