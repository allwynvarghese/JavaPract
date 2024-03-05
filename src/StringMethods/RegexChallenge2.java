package StringMethods;

public class RegexChallenge2 {

    public static void main(String[] args) {
        String str = "H@ll0 Wor3ld&";

        //remove special characters
        System.out.println("new Str: "+ str.replaceAll("[^a-zA-Z0-9 ]", ""));
    }
}
