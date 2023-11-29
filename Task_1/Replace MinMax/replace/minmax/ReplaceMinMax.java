
package replace.minmax;

import java.util.Scanner;

/**
 *
 * @author sky
 */
public class ReplaceMinMax {

   
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
       int[] arr = new int[n];
      for( int j=0;j<n;j++){
        arr[j]=input.nextInt();
      }
      int min = arr[0];
      int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < n; i++){
          if(arr[i]==min){
           arr[i]=max;
          }
          else if ( arr[i]==max){
              arr[i]=min;
          }
     
        }
        for (int j = 0; j < n; j++){
              System.out.print(arr[j] +" ");
          }
    }
    
}
