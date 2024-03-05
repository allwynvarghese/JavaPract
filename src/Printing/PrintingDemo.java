package Printing;

public class PrintingDemo {

    public static void main(String[] args) {

        int x=10;
        float y=20.234f;
        char c = 'a';
        String str = "world";
        int k = -10;

        //System.out.printf
        System.out.printf("x+y is %f", (x+y));

        System.out.printf("\nx,y,c is %1$d, %2$2.2f, %3$c", x,y,c);

        System.out.printf("\nk is %(d", k);
    }
}
