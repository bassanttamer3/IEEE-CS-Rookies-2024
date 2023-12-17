
package array.average;

import java.util.Scanner;

public class ArrayAverage {

    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
         double[] n = new double[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextDouble();
        }
         ave(n,t);
    }
    
    public static void ave(  double[] n ,int t){
    double sum=0;
    
    for (int i = 0; i <t ; i++){
      sum+=n[i];
    }
       System.out.printf("%.6f", sum/t);
    }
}
