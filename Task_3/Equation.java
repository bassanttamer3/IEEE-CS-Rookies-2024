
package equation;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long S = 0;
         
        for (long i = 2; i <= n; i += 2) {
            S += Math.pow(x, i);
        }
        
        System.out.println(S);
    }
}
