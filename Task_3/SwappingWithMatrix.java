
package swapping.with.matrix;

import java.util.Scanner;
public class SwappingWithMatrix {

  
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

     
        int[][] resultMatrix = swapRowsAndColumns(matrix, X, Y);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    static int[][] swapRowsAndColumns(int[][] matrix, int x, int y) {
   
        int[] tempRow = matrix[x-1];
        matrix[x-1] = matrix[y-1];
        matrix[y-1] = tempRow;
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][x-1];
            matrix[i][x-1] = matrix[i][y-1];
            matrix[i][y-1] = temp;
        }

        return matrix;
    }}