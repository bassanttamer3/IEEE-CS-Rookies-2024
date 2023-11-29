
package smallest.pair;

import java.util.Scanner;


public class SmallestPair {

  
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
      int t=input.nextInt();
      for(int i=0;i<t;i++){
       int n=input.nextInt();
       int[] arr = new int[n];
      for( int j=0;j<n;j++){
        arr[j]=input.nextInt();
      }
      
     int result = findSmallestSum(arr, n);
            System.out.println(result);
        }
    }
    public static int findSmallestSum(int[] arr, int n){
           int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int currentSum = arr[i] + arr[j] + (j - i);
                minSum = Math.min(minSum, currentSum);
            }
        }

        return minSum;
    }
}
