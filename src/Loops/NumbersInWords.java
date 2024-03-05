package Loops;

public class NumbersInWords {

    public static void main(String[] args) {
        int num = 253;
        String fin = "";
        String strNum, finVal = "";
        while(num > 0){
            int rem = num % 10;
            String val = String.valueOf(rem);
            switch (val){
                case "0":
                    strNum = "zero";
                    break;
                case "1":
                    strNum = "one";
                    break;
                case "2":
                    strNum = "two";
                    break;
                case "3":
                    strNum = "three";
                    break;
                case "4":
                    strNum = "four";
                    break;
                case "5":
                    strNum = "five";
                    break;
                case "6":
                    strNum = "six";
                    break;
                case "7":
                    strNum = "seven";
                    break;
                case "8":
                    strNum = "eight";
                    break;
                case "9":
                    strNum = "nine";
                    break;
                default:
                    strNum = "invalid number";
                    break;
            }
            finVal = strNum + " " + finVal;
            num = num/10;
        }
        System.out.println(finVal);
    }
}
