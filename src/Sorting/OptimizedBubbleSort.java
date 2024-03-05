package Sorting;

import java.util.Arrays;

public class OptimizedBubbleSort {

    public static void main(String[] args) {
        int [] arr = {4,3,5,1,2};
        int arr2[] = {6,7,8,9,11};

        System.out.print("\nBefore sort: ");
        printArray(arr2);
        bubbleSort(arr2); //Complexity O(n^2). Optimized to O(n) if array is already sorted
        System.out.print("\nAfter sort: ");
        printArray(arr2);
    }

    public static void printArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::print);
    }

    //Complexity O(n^2). Optimized to O(n) if array is already sorted
    public static void bubbleSort(int[] arr) {

        //Number of turns
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            //swapping elements in each turn
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //swap larger element to end.
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            //check if array is sorted
            if(!swapped){
                System.out.println("\nArray is sorted.");
                break;
            }
        }
    }
}
