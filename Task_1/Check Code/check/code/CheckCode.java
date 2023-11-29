
package check.code;

import java.util.Scanner;

public class CheckCode {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

  
        int A = input.nextInt();
        int B = input.nextInt();

     
        String S = input.next();

        String result = checkCodeRules(A, B, S);

   
        System.out.println(result);

        input.close();
    }

    private static String checkCodeRules(int A, int B, String S) {
 
        if (A + 1 >= S.length() || S.charAt(A) != '-') {
            return "No";
        }

      
        for (int i = 0; i < A + B + 1; i++) {
            if (i != A && !Character.isDigit(S.charAt(i))) {
                return "No";
            }
        }

        return "Yes";
    }
}
