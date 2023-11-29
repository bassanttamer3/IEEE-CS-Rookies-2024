
package count.subarrays;

import java.util.Scanner;

public class CountSubarrays {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = input.nextInt();
            }

            int result = countNonDecreasingSubarrays(n, arr);
            System.out.println(result);
        }}
       public static int countNonDecreasingSubarrays(int n, int[] arr) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isNonDecreasing(arr, i, j)) {
                    count++;
                } else {
                    break; 
                }
            }
        }

        return count;
    }

    public static boolean isNonDecreasing(int[] arr, int start, int end) {
        for (int k = start; k < end; k++) {
            if (arr[k] > arr[k + 1]) {
                return false;
            }
        }
        return true;
    }
}