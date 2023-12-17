
package reach.value;

import java.util.Scanner;

public class ReachValue {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
         for (int i = 0; i < t; i++) {
             long n=sc.nextLong();
           if(value(n)) {
           
               System.out.println("YES");
           }else
                 System.out.println("NO");
         }
        
    }
    public static boolean  value(long n ){
       if (n == 1) {
            return true;
        }
        
        if (n % 10 == 0 && value(n / 10)) {
            return true;
        }

        if (n % 20 == 0 && value(n / 20)) {
            return true;
        }

        return false;
    }
}
