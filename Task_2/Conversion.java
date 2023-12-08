<<<<<<< HEAD

package conversion;

import java.util.Scanner;


public class Conversion {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   String s = scanner.nextLine();
 
        String replacedCommas = s.replace(',', ' ');

        String p = swap(replacedCommas);

        System.out.println(p);
    }

    private static String swap(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            }
        }
        return new String(charArray);
    }
}
    

=======

package conversion;

import java.util.Scanner;


public class Conversion {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   String s = scanner.nextLine();
 
        String replacedCommas = s.replace(',', ' ');

        String p = swap(replacedCommas);

        System.out.println(p);
    }

    private static String swap(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            }
        }
        return new String(charArray);
    }
}
    

>>>>>>> 446e33e316cf490399143f7b92cc8e58b8a16e02
