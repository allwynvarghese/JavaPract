package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {3,4,1,2,6,9,7};

        System.out.print("\nBefore sort: ");
        printArray(arr);
        selectionSort(arr); //Complexity O(n^2)
        System.out.print("\nAfter sort: ");
        printArray(arr);
    }

    public static void selectionSort(int [] arr){

        //No. of turns to sort
        for(int i=0;i<arr.length-1;i++){
            int minPos = i;
            //elements to sort
            for(int j=i+1;j<arr.length;j++){
                //finding min. number index
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            //swapping position of i with index of min position
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void printArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::print);
    }
}
