package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class CopyingArray {

    public static void main(String[] args) {

        //copy arrA to arrB
        int [] arrA = {1,2,3,4,5,6,7,9};
        System.out.print("arrA: ");
        Arrays.stream(arrA).forEach(System.out::print);

        int [] arrB = new int[arrA.length];

        for(int i=0;i<arrA.length;i++){
            arrB[i] = arrA[i];
        }
        System.out.print("\narrB: ");
        Arrays.stream(arrB).forEach(System.out::print);
    }
}
