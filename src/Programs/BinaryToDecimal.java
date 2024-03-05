package Programs;

public class BinaryToDecimal {

    public static void main(String[] args) {

        int binNum = 101;

        System.out.println("Binary to decimal for " + binNum + " is " + binaryToDecimal(binNum));
    }

    public static int binaryToDecimal(int binNum){
        int pow = 0, dNum = 0;

        while (binNum > 0){
            int lastNum = binNum % 2;
            dNum = dNum + (lastNum * (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        return dNum;
    }
}
