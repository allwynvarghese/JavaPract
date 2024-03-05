package ExceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class TryWithResources {

    public static void fileReader(){
        try(
                FileInputStream fis = new FileInputStream("C:\\Users\\allwyn.oommen\\Shops_Tests\\JavaPract\\text.txt");
                Scanner sc = new Scanner(fis);                ){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.printf("a = %d, b = %d & c = %d", a,b,c);

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fileReader();
    }
}
