package Programs;

public class DecimalToBinary {

    public static void main(String[] args) {
        int num = 7;
        System.out.println("Decimal to binary for " + num + " is " + decimalToBinary(num));
    }

    public static int decimalToBinary(int num){
        int binNum =0, pow =0;

        while(num > 0){
            int rem = num%2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            num=num/2;
        }
        return binNum;
    }
}
