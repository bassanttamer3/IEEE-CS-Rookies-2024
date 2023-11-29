
package minimize.number;

import java.util.Scanner;


public class MinimizeNumber {

    
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
      int n=input.nextInt();
       int[] arr = new int[n];
      for( int j=0;j<n;j++){
        arr[j]=input.nextInt();
      }
       int result = maxOperations(n, arr);
        System.out.println(result);
    }

    
    public static int maxOperations(int n, int[] arr) {
        boolean even = false;
        int numres = 0;


        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                even = false;
                break;
            }
            even = true;
        }

 
        while (even) {
            for (int i = 0; i < n; i++) {
                arr[i] /= 2;
            }
            numres++;

          
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    even = false;
                    break;
                }
                even = true;
            }
        }
        return numres;
    }
}

    
    

