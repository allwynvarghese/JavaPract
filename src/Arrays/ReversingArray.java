package Arrays;

public class ReversingArray<T> {

    public static <T> void reverseArray(T [] arr){
        int start = 0, end = arr.length-1;

        T temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }

    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            // Add a space or another separator after each element, except the last one
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] arr = {1,2,3,45,5};
        System.out.print("Current array: ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("\nReversed Array: ");
        printArray(arr);
    }
}
