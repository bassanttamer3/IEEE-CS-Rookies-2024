
package max.subarray;

import java.util.Scanner;

/**
 *
 * @author bassant
 */
public class MaxSubarray {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
      int t=input.nextInt();
      for(int i=0;i<t;i++){
       int n=input.nextInt();
       int[] arr = new int[n];
      for( int j=0;j<n;j++){
        arr[j]=input.nextInt();
      }
        MaximumSubArray(arr, n);
    }
    
    }
 
    private static void MaximumSubArray(int[] arr, int n) {
         for (int i = 0; i < n; i++) {
            int max = arr[i];
            for (int j = i; j < n; j++) {
                max = Math.max(max, arr[j]);
                System.out.print(max + " ");
            }
        }
        System.out.println();
    }
}
