
package print.from.pkg1.to.n;

import java.util.Scanner;

public class PrintFrom1ToN {

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
      int N= sc.nextInt();
      print(N);
    }
      public static void print(int n) {
       for(int i=1;i<=n;i++){
            System.out.println(i);
            
        }
    }
}