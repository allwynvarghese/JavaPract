package Arrays;

import java.util.Arrays;

public class CreateBiggerArray {

    public static void main(String[] args) {

        //old array
        int [] arrA = {1,2,3,4};
        System.out.print("\narrA: ");
        Arrays.stream(arrA).forEach(System.out::print);

        //new bigger array
        int arrB[] = new int[10];
        for(int i=0; i<arrA.length;i++){
            arrB[i] = arrA[i];
        }

        arrA = arrB;
        arrB = null;

        System.out.print("\narrA: ");
        Arrays.stream(arrA).forEach(System.out::print);

    }
}
