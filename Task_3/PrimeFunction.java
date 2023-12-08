
package prime.function;

import java.util.Scanner;


public class PrimeFunction {

   
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       for(int i=0;i<t;i++){
        int n=s.nextInt(); 
        if(isprime(n)){
               System.out.println("YES");
       }
       else{
               System.out.println("NO");
               }
       }
      }
    public static boolean isprime(int n){
            if (n < 2) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true;
    }
}