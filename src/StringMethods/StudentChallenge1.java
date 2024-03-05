package StringMethods;

public class StudentChallenge1 {

    public static void checkString(String str){

        if(str.contains("gmail")){
            String [] splitter = str.split("@");
            String user = splitter[0];
            String domain = splitter[1];
            System.out.printf("username: %s and domain: %s\n", user, domain);
        }else{
            System.out.println("This is not in gmail domain.");
        }
    }

    public static void main(String[] args) {

        String str = "programmer@gmail.com", str1 = "analyser@hotmail.com";

        checkString(str1);
    }
}
