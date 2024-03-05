package Arrays;

/* Rotating array
* input: {1,2,3,4,5}
* output: {5,1,2,3,4}
* */
public class RotatingArray <T> {

    public static <T> void rotateArray(T[] arr){

        int len = arr.length;
        T lastE = arr[len-1];
        for(int i=len-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastE;
    }

    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] nums = {1,2,3,4,5};
        rotateArray(nums);
        printArray(nums);

    }

}
