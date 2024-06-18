
package subsequence.string;

import java.util.Scanner;

public class SubsequenceString {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        if (Hello(s)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean Hello(String s) {
        String target = "hello";
        int targetIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(targetIndex)) {
                targetIndex++;
            }

            if (targetIndex == target.length()) {
           
                return true;
            }
        }
        return false;
    }
}

    
