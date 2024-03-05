package Arrays;

import java.util.Arrays;

public class ReverseCopyingArray {
    public static void main(String[] args) {

        int [] arrA = {1,2,3,4,5,6,7,9};
        System.out.print("\narrA : ");
        Arrays.stream(arrA).forEach(System.out::print);

        int [] arrB = new int[arrA.length];

        for(int i= arrA.length-1, j=0;i>=0;i--,j++){
            arrB[j] = arrA[i];
        }

        System.out.print("\narrB : ");
        Arrays.stream(arrB).forEach(System.out::print);
    }
}
