package JavaIO;

import java.io.FileInputStream;

public class FisDemo {

    public static void main(String[] args) {

        try(
                FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/test.txt")
                ){
            int x ;
            while((x=fis.read())!=-1){
                System.out.print((char)x);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
