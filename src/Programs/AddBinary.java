package Programs;

public class AddBinary {

    public static String addBinaryStrings(String s1, String s2){

        int x = Integer.parseInt(s1,2); //convert binary string to decimal
        int y = Integer.parseInt(s2, 2);

        int sum = x+y;
        String result = Integer.toBinaryString(sum); //Convert the integer sum to Binary string.
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addBinaryStrings("011011", "1010111"));
    }
}
