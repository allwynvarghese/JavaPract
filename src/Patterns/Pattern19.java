package Patterns;

public class Pattern19 {

    public static void main(String[] args) {

        int rows = 5;
        int initS = 0;

        for(int i=0;i<rows;i++){
            //1st star
            for(int j=0;j<(rows-i);j++){
                System.out.print("*");
            }
            //System.out.println("");


            //space
            for(int j=0;j<initS;j++){
                System.out.print(" ");
            }
            initS+=2;

            //2nd star
            for(int j=0;j<(rows-i);j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=rows;i>=0;i--){
            //1st star
            for(int j=0;j<(rows-i);j++){
                System.out.print("*");
            }
            //System.out.println("");


            //space
            for(int j=0;j<initS;j++){
                System.out.print(" ");
            }
            initS+=2;

            //2nd star
            for(int j=0;j<(rows-i);j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
