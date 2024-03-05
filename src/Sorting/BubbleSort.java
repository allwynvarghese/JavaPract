package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int [] arr = {4,3,5,1,2};

        System.out.print("\nBefore sort: ");
        printArray(arr);
        bubbleSort(arr); // complexity O(n^2)
        System.out.print("\nAfter sort: ");
        printArray(arr);
    }

    public static void printArray(int[] arr){

        Arrays.stream(arr).forEach(System.out::print);
    }

    // complexity O(n^2)
    public static void bubbleSort(int[] arr) {

        //Number of turns
        for(int i=0;i<arr.length-1;i++){

            //swapping elements in each turn
            for (int j=0;j< arr.length-1-i;j++){
                //swap larger element to end.
                int temp;
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
