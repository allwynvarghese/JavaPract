package Loops;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = 1001, rev=0, temp=num;

        while(num > 0){
            int rem = num %10;
            rev = (rev*10) + rem;
            num=num/10;
        }
        System.out.println(rev);
        if(temp==rev) System.out.println("Palindrome");
        else System.out.println("Nicht palindrome");
    }
}
