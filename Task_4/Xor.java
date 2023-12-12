
package xor;

import java.util.Scanner;


public class Xor {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         long a = sc.nextLong();
        long b = sc.nextLong();
        long q = sc.nextLong();
        System.out.println( f(a,b,q));
       
  }
       public static long f(long a, long b, long q) {
         long res =(q%3);
        if (res == 1) {
            return a;
        } else if (res == 2) {
            return b;
        } else {
            return a^b;
        }
        
    }
}
