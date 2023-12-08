<<<<<<< HEAD
package count.words;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String s = scanner.nextLine();
     int count=0;
          for (String word : s.split("\\.\\.\\.|\\p{Space}+")) {
            if (!word.isEmpty()) {
              count++;
            }
        }

        
        System.out.println( count);
    }
=======
package count.words;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     String s = scanner.nextLine();
     int count=0;
          for (String word : s.split("\\.\\.\\.|\\p{Space}+")) {
            if (!word.isEmpty()) {
              count++;
            }
        }

        
        System.out.println( count);
    }
>>>>>>> 446e33e316cf490399143f7b92cc8e58b8a16e02
}