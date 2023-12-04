
package max.subsequence;

import java.util.Scanner;


public class MaxSubsequence {

   
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  String S = scanner.nextLine().trim();
        int maxSubsequence = max(N, S);

    
        System.out.println(maxSubsequence);
    }
    public static int max( int N, String S  ){

      char prevChar = '\0';
        StringBuilder subsequence = new StringBuilder();

       
        for (int i = 0; i < N; i++) {
            char currentChar = S.charAt(i);

           
            if (currentChar != prevChar) {
                subsequence.append(currentChar);
                prevChar = currentChar;
            }
        }
        return subsequence.length();
    }
}