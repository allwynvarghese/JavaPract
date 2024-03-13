package Patterns;

public class Pattern18 {

    public static void main(String[] args) {

        int row = 5;

        for(int i=0;i<row;i++){
            for(char ch = (char)('E'-i);ch<='E';ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}
