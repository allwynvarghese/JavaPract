package Loops;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n1=0, n2=1,  n3=0, numbers=10;

        System.out.print(n1+" "+n2);
        for(int i=0;i<numbers;i++){
                n3 = n1+n2;
            System.out.print(" "+ n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}
