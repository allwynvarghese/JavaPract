package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class IOChallenge2 {

    public static void main(String[] args) {
        String sysPath = System.getProperty("user.dir");

        try(
                FileInputStream fis1 = new FileInputStream(sysPath + "/test.txt");
                FileInputStream fis2 = new FileInputStream(sysPath + "/text.txt");
                FileOutputStream fos = new FileOutputStream(sysPath + "/destination.txt");

                ){
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
            int x;

            while((x=sis.read())!=-1){
                fos.write(x);
                //if(fis1.available()==0) fos.write("\n".getBytes());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
