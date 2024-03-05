package Arrays;

//search, insert & delete in an unsorted array
public class UnsortedArray {

    //return the index of an element in unsorted array
    public static int findElement(int[] arr, int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    //insert a key at the end of an unsorted array
    public static int insertAtEnd(int [] arr, int key, int capacity, int currentLen){

        //checking capacity
        if(currentLen >= capacity){
            return -1;
        }

        arr[currentLen] = key;
        return currentLen+1;
    }

    //insert an element at a position
    public static void insertAt(int [] arr, int key, int pos){


    }

    //printing the array
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {

        //Finding an array
        int [] arr = {4,3,8,1,2,6,9,5};
        int key = 6;

        System.out.printf("The %d is at position %d in the array.\n", key, findElement(arr, key));

        //inserting an element at the end.
        int capacity = 10;
        int [] arr2 = new int[capacity];
        arr2[0] = 5;
        arr2[1] = 7;
        int currentLen = 2;

        if(insertAtEnd(arr2, 26, capacity,currentLen) != -1) printArray(arr2);
        else System.out.println("Array is full!");

        //insert an element at a position
        int [] arr3 = {1,2,3,4,5,6};


    }
}
