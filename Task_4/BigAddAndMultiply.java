
package big.add.and.multiply;

import java.math.BigInteger;
import java.util.Scanner;


public class BigAddAndMultiply {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger N = sc.nextBigInteger();
        
        BigInteger sumResult = N.add(BigInteger.valueOf(9999));
        BigInteger multiplyResult = N.multiply(BigInteger.valueOf(9999));
 
        
        System.out.println(sumResult);
        System.out.println(multiplyResult);
    }
    
}
