
package combination.and.permutation;

import java.util.Scanner;


public class CombinationAndPermutation {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(Combination(a, b));
        System.out.print(" ");
        System.out.println(Permutation(a, b));
    }

    public static long Factorial(int n) {
        if (n < 0) {
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long Combination(int n, int r) {
        return Factorial(n) / (Factorial(r) * Factorial(n - r));
    }

    public static long Permutation(int n, int r) {
        return Factorial(n) / Factorial(n - r);
    }
}