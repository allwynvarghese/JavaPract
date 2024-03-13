package FunctionalProgramming;

import java.util.List;

public class FP02Ex {

    //reduce method exercises
    public static void main(String[] args) {

        //Ex.7 Square every number in the list and find the sum of squares
        System.out.println(squareSum(List.of(1,2,3,4,5)));

        //Ex.8 Cube every number in the list and find the sum of cubes
        System.out.println(cubeSum(List.of(1,2,3,4,5)));

        //Ex.9 find sum of odd numbers in the list
        System.out.println(sumOfOddNums(List.of(1,3,4,2,4,5,6,7,8,9)));
    }

    private static int sumOfOddNums(List<Integer> nums) {

        return nums.stream().filter(num->num%2==1).reduce(0, Integer::sum);
    }

    private static int cubeSum(List<Integer> nums) {
        return nums.stream().map(m->m*m*m).reduce(0, Integer::sum);
    }

    public static int squareSum(List <Integer> nums){
        return nums.stream().map(m->m*m).reduce(0, Integer::sum);
    }
}
