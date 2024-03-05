package Loops;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 371, arm=0;
        int temp = num;

        while(num > 0){
            int rem = num % 10;
            arm = arm + rem*rem*rem;
            num=num/10;
        }
        if(arm == temp) System.out.println("Armstrong!");
        else System.out.println("Nicht Armstrong!");
    }
}
