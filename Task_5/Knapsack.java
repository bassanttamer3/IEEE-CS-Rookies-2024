
package knapsack;

import java.util.Scanner;

public class Knapsack {

    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] weights = new int[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }

        int result = knapsack(n, w, weights, values);
        System.out.println(result);
    }

    public static int knapsack(int n, int w, int[] weights, int[] values) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (weights[n - 1] > w) {
            return knapsack(n - 1, w, weights, values);
        }

        int ItemA = values[n - 1] + knapsack(n - 1, w - weights[n - 1], weights, values);
        int ItemB = knapsack(n - 1, w, weights, values);

        
        return Math.max(ItemA, ItemB);
    }
}
