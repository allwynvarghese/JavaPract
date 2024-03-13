package FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FP03Ex {

    //Functional Inteferface demo
    public static void main(String[] args) {

        //Ex.12 Find the functional interfacae behind the second arguement of the reduce method.
        //reduce(0, Integer::sum)
        //Create an implementaion for the functional interface

        System.out.println(printSumOfNums(List.of(1,2,3,4,5,6)));
    }

    private static int printSumOfNums(List<Integer> nums) {

        //right click on function >> Refactor >> Extract function
        BinaryOperator<Integer> getBinaryOperator = Integer :: sum;

        return nums.stream().reduce(0, getBinaryOperator);
    }

}
