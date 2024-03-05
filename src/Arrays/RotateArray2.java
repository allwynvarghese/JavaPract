package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class RotateArray2 {

    public static void main(String[] args) {

        //rotate the elements oof the array
        int [] arr = {1,2,3,4,5,6,8};

        System.out.print("\nBefore: ");
        Arrays.stream(arr).forEach(System.out::print);

        int temp = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
        System.out.print("\nAfter: ");
        Arrays.stream(arr).forEach(System.out::print);

    }
}
