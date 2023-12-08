<<<<<<< HEAD

package good.or.bad;

import java.util.Scanner;

public class GoodOrBad {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scanner.next();  
            String result = goodorbad(s) ? "Good" : "Bad";
            System.out.println(result);
        }
    }

    public  static boolean goodorbad(String s){
    return s.contains("010") || s.contains("101");
    
    }
}
=======

package good.or.bad;

import java.util.Scanner;

public class GoodOrBad {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String s = scanner.next();  
            String result = goodorbad(s) ? "Good" : "Bad";
            System.out.println(result);
        }
    }

    public  static boolean goodorbad(String s){
    return s.contains("010") || s.contains("101");
    
    }
}
>>>>>>> 446e33e316cf490399143f7b92cc8e58b8a16e02
