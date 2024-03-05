package Arrays;

public class Adding2Matrices {

    public static void main(String[] args) {

        //2D arrays - Add 2 matrices and store the sum as results as 3rd matrix.
        int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] B = {{2,3,4},{6,7,8},{8,0,9}};

        int [][] C = new int[3][3];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<3;j++){
                C[i][j] = A[i][j]+B[i][j];
            }
        }

        for(int i=0;i<C.length;i++){
            for(int j=0;j<3;j++){
                System.out.print(C[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
