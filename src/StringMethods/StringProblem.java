package StringMethods;

public class StringProblem {

    public static void main(String[] args) {

        String num = "234570";

        char[] arr = num.toCharArray();

        System.out.println((arr[arr.length-1]-'0') + (arr[0]-'0'));
    }
}
