package Arrays;

public class RotateArrayByNum {

    public static void printArray(int [] arr){

        for(int i : arr){
            System.out.print(i);
        }
    }

    public static int[] rotateArrayByNum(int [] arr, int num) throws IllegalArgumentException {
        // ANSI escape code for red color
        String redColorCode = "\u001B[31m";
        // ANSI escape code to reset color to default
        String resetColorCode = "\u001B[0m";
        if(num > arr.length){
            throw new IllegalArgumentException(redColorCode+"!!Err: Number to rotate should be less than array length!!"+resetColorCode);
        }

        int [] temp = new int[arr.length];
        int counter = 0;
        for(int i=num;i<arr.length;i++){
            temp[counter] = arr[i];
            counter++;
        }

        for(int i=0;i<num;i++){
            temp[counter] = arr[i];
            counter++;
        }

        return temp;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int rotate = 2;

        System.out.print("\nBefore: ");
        printArray(arr);
        System.out.print("\nAfter: ");
        try{
            printArray(rotateArrayByNum(arr,rotate));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
