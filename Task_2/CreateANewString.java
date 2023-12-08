
package create.a.pkgnew.string;

import java.util.Scanner;


public class CreateANewString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        String T = scanner.nextLine().trim();
        System.out.println(S.length() + " " + T.length());
  
        System.out.println(S + " " + T);
    scanner.close();
    }
}
    
    

