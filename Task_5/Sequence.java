
package pkg3n.pkg1.sequence;

import java.util.Scanner;


public class Sequence {

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
        System.out.println(seq(n));
    }
    public static int seq(int  n){
         if (n == 1)
        return 1;
      if(oddoreven(n)){
        return 1+seq(n/2);
        
      }else 
          return 1+seq(3*n+1) ;
          
      }
    public static boolean oddoreven(int n){
      if(n%2==0){
          return true;
      }else
          return false;
    }
}
