package Loops;

public class ArithematicProgression {

    public static void main(String[] args) {

        int start = 5, diff=3, limit = 15, sum=start;

        System.out.print(start);
        for(int i=0;i<limit;i++){
            System.out.print(" " + (sum += diff) + " ");
        }
    }


}
