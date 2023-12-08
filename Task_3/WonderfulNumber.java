
package wonderful.number;

import java.util.Scanner;

public class WonderfulNumber {
    public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            if( wonderful(n) && binaryrepresentation(n) ){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
    }
    public static boolean wonderful(int n){
    boolean  numwonderful=false;
      if(n%2==0){
      numwonderful=false;
      
      }
      else
            numwonderful=true;
        return numwonderful;
    }
    
    public static boolean binaryrepresentation(int n){
        String numStr = Integer.toBinaryString(n);
        int left = 0;
        int right = numStr.length() - 1;

        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }

        return true; 
    }
}
   
