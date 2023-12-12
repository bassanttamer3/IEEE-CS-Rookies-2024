
package convert.to.base;

import java.util.Scanner;
public class ConvertToBase {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            long N = sc.nextLong();
            int X = sc.nextInt();

            if (T == 1) {
               
                System.out.println(ToDecimal(N, X));
            } else if (T == 2) {
                
                System.out.println(ToBaseX(N,X));
            }
        }
    

     public static long ToDecimal(String N, int X) {
        long result = 0;
        long multiplier = 1;

        for (int i = N.length() - 1; i >= 0; i--) {
            char digit = N.charAt(i);
            int value = Character.isDigit(digit) ? Character.getNumericValue(digit) : digit - 'A' + 10;
            result += value * multiplier;
            multiplier *= X;
        }

        return result;
    }
    public static String ToBaseX(long N, int X) {
          String result = "";

        while (N > 0) {
            long remainder = N % X;
            char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
            result = digit + result;
            N /= X;
        }

        return result;
    }}