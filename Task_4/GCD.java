
package gcd;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
         long n=sc.nextLong();
         long c=sc.nextLong();
         long g = gcd(n, c);
         long l=lms(n,c);
        System.out.print( g);
        System.out.print(" ");
        System.out.println( l);
        }
 
    private static long gcd(long n, long c) {
        if (c == 0) {
            return n;
        } else {
            return gcd(c, n % c);
        }
    }
     private static long lms(long n, long c) {
      return (n* c) / gcd(n, c);
      
     }
}

