
package pkgnew.array;

import java.util.Scanner;

public class NewArray {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int A[]=new int[n];
       int B[]=new int[n];
      for (int i = 0; i < n; i++) {
            A[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            B[i] = s.nextInt();
        }
        int[] C = new int[2 * n];
        for (int i = 0; i < n; i++) {
            C[i] = B[i];
            C[n + i] = A[i];
        }
           for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] +" ");
           }
    }
    
}
