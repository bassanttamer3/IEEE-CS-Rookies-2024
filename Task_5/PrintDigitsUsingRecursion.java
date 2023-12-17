
package print.digits.using.recursion;

import java.util.Scanner;

public class PrintDigitsUsingRecursion {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
         for (int i = 0; i < t; i++) {
            String n = sc.next();
            print(n);
            System.out.println();  
        }
    }
    public static void print(String n){
         for (int i = 0; i < n.length(); i++) {
         System.out.print(n.charAt(i));
          if (i < n.length() - 1) {
                System.out.print(" ");
            }
    }}
}
