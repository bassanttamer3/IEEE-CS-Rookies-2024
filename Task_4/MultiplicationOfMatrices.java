
package multiplication.of.matrices;

import java.util.Scanner;


public class MultiplicationOfMatrices {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);  
        int ra = sc.nextInt(); 
        int ca = sc.nextInt(); 
        int[][] matrixa= new int[ra][ca];

        for (int i = 0; i < ra; i++) {
            for (int j = 0; j < ca; j++) {
                matrixa[i][j] = sc.nextInt();
            }
        }

        
        int rb = sc.nextInt(); 
        int cb = sc.nextInt();
        int[][] matrixb = new int[rb][cb];

        for (int i = 0; i < rb; i++) {
            for (int j = 0; j < cb; j++) {
                matrixb[i][j] = sc.nextInt();
            }
        }

      
        int[][] resultMatrix = multiply(matrixa, matrixb, ra, ca, cb);

        for (int i = 0; i < ra; i++) {
            for (int j = 0; j < cb; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
      private static int[][] multiply(int[][] A, int[][] B, int ra, int ca, int cb) {
        int[][] result = new int[ra][cb];

        for (int i = 0; i < ra; i++) {
            for (int j = 0; j < cb; j++) {
                for (int k = 0; k < ca; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}
    

