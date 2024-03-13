package FunctionalProgramming;

import java.util.List;

public class DistinctDemo {

    public static void main(String[] args) {

        distinctMethDemo(List.of(1,2,3,33,33,2,1,2,3,4,4,5,5,6));
    }

    private static void distinctMethDemo(List<Integer> nums) {

        //distinct method
        nums.stream().sorted().distinct().forEach(System.out::println);
    }
}
