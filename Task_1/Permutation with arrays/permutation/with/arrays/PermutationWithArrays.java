
package permutation.with.arrays;
 
import java.util.Arrays;
import java.util.Scanner;
public class PermutationWithArrays {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        long arraya []= new long[n];
        long arrayb []= new long[n];
         for(int i=0;i<n;i++){
             arraya [i]=in.nextLong();
         }
         for(int i=0;i<n;i++){
             arrayb [i]=in.nextLong();
         }
           Arrays.sort(arraya);
           Arrays.sort(arrayb);
          boolean isPermutation = Arrays.equals(arraya, arrayb);
 
        if (isPermutation) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
 
       
    }
}
