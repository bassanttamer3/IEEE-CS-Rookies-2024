
package shift.right;

import java.util.Scanner;


public class ShiftRight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int[] resultArray = rightShiftArray(array, X);

        
        for (int i = 0; i < N; i++) {
            System.out.print(resultArray[i] + " ");
        }

        scanner.close();
    }

     public static int[] rightShiftArray(int[] array, int X) {
        int N = array.length;

        X = X % N;

        int[] resultArray = new int[N];

    
        for (int i = 0; i < N; i++) {
            resultArray[(i + X) % N] = array[i];
        }

        return resultArray;
    }
}