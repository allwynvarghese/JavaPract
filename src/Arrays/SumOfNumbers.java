package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumOfNumbers {

    public static void main(String[] args) {

        int size = 5;
        int [] arr = {1,3,5,6,8};
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter numbers in the array of size: "+ size);
        for(int i=0;i<size;i++){
            int num = scan.nextInt();
            arr[i] = num;
        }*/

        System.out.print("The newly created array is [");
        for(int i=0;i<size;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");

        sumOfNumbers(arr);
        searchAnElement(arr, 8);
        findMaxNum(arr);
        secondMax(arr);

    }

    //1. sum of all the numbers in an array
    public static void sumOfNumbers(int [] arr){

        int sum = 0;
        for(int x: arr){
            sum += x;
        }
        System.out.printf("\nSum of all the numbers in the array is %d", sum);
    }

    //2. Searching an element in the array
    public static void searchAnElement(int [] arr, int reqNum){
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        if(!list.contains(reqNum)){
            System.out.println("\nDoesn't exists");
            return;
        }
        System.out.print("\nThe indices of the element in the array is/are  ");
        for(int i=0;i<arr.length;i++){
            if( arr[i]==reqNum ){
                System.out.print(i+" ");
            }
        }
    }

    public static void findMaxNum(int [] arr){

        int maxNum = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > maxNum){
                maxNum = num;
            }
        }
        System.out.printf("\nMax num of the array is %d", maxNum);
    }

    public static void secondMax(int [] arr){
        int maxNum = Integer.MIN_VALUE, max2=maxNum;

        for(int num: arr){
            if(num > maxNum){
                max2 = maxNum;
                maxNum = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        /*for(int num: arr){
            if(num > max2 && num < maxNum){
                max2 = num;
            }
        }*/
        System.out.printf("\nMax num of the array is %d & 2nd Max is %d", maxNum, max2);
    }
}
