package StringMethods;

public class RegexChallenge1 {

    public static void main(String[] args) {

        //1. Find if the number is binary
        int num = 101101;
        String strNum = String.valueOf(num);
        System.out.println("Is the number binary? - "+ strNum.matches("[01]+"));

        //2. Find if the number is hexadecimal
        int hexNum = 0x234A;
        String hexValue = String.valueOf(hexNum);
        System.out.println("Is it a hexadecimal number? - " + hexValue.matches("[0-9A-Fa-f]+") );

        //3. Find if the date is in format dd/MM/yyyy
        String aDate = "24/03/1988";
        System.out.println("Is the date format correct? - "+ aDate.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
