package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.StandardCharsets;

public class IOChallenge {

    public static void main(String[] args) {

        String sysPath = System.getProperty("user.dir");

        try(
                FileInputStream fis = new FileInputStream(sysPath + "/test.txt");
                FileOutputStream fos = new FileOutputStream(sysPath + "/text.txt", true);

                ){

            int x;
            while((x=fis.read())!=-1){
                if(x >= 65 && x <= 90) fos.write((char)x+32);
                else fos.write((char)x);
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
