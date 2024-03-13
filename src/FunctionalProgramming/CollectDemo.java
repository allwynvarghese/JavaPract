package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {

    //collect method demo exercises
    public static void main(String[] args) {

        //Ex.10 Create a list of even numbers filtered from a list
        System.out.println(createEvenNumberList(List.of(1,2,3,4,5,6,7,8,9,12,13)));

        //Ex.11 Create a list with the length of all the course titles
        System.out.println(createListOfCourseTitles(List.of("Spring", "Spring Boot", "API", "Microservices", "AMS", "PCF", "Azure")));
    }

    private static List<Integer> createListOfCourseTitles(List<String> courses) {

        return courses.stream().map(String::length).collect(Collectors.toList());
    }

    private static List<Integer> createEvenNumberList(List<Integer> nums) {

        return nums.stream().filter(n->n%2==0).collect(Collectors.toList());
    }
}
