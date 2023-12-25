<<<<<<< HEAD

package encrypt.and.decrypt.message;

import java.util.Scanner;

public class EncryptAndDecryptMessage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q = scanner.nextInt();
        scanner.nextLine();
        String S = scanner.nextLine();
        String key = "PgEfTYaWGHjDAmxQqFLRpCJBownyUKZXkbvzIdshurMilNSVOtec#@_!=.+-*/";
        String original = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int n = S.length();

        if (Q == 1) {
            for (int i = 0; i < n; i++) {
                char currentChar = S.charAt(i);
                int index = original.indexOf(currentChar);
                if (index != -1) {
                    System.out.print(key.charAt(index));
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                char currentChar = S.charAt(i);
                int index = key.indexOf(currentChar);
                if (index != -1) {
                    System.out.print(original.charAt(index));
                }
            }
        }
    }
}

