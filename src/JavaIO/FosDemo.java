package JavaIO;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FosDemo {

    public static void main(String[] args) {

        try(
                FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "/test.txt", true);
                ){

            String message = "Hello world from  the program\n";
            fos.write(message.getBytes(StandardCharsets.UTF_8));

            byte[] bar = message.getBytes();
            fos.write(bar);

            fos.write(bar, 0, 11);


        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
