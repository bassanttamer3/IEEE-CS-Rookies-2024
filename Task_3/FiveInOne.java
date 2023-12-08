
package five.in.one;

import java.util.Scanner;


public class FiveInOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int max = getMax(array);
        int min = getMin(array);
        int primeCount = countPrimes(array);
        int palindromeCount = countPalindromes(array);
        int maxDivisorsNumber = getMaxDivisorsNumber(array);

        System.out.println("The maximum number : " + max);
        System.out.println("The minimum number : " + min);
        System.out.println("The number of prime numbers : " + primeCount);
        System.out.println("The number of palindrome numbers : " + palindromeCount);
        System.out.println("The number that has the maximum number of divisors : " + maxDivisorsNumber);

        scanner.close();
    }

    static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            max = Math.max(max, num);
        }
        return max;
    }

    static int getMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            min = Math.min(min, num);
        }
        return min;
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int countPrimes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean isPalindrome(int num) {
        String numStr = Integer.toString(num);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }

    static int countPalindromes(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isPalindrome(num)) {
                count++;
            }
        }
        return count;
    }

    static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    static int getMaxDivisorsNumber(int[] array) {
        int maxDivisorsNumber = array[0];
        int maxDivisorsCount = countDivisors(array[0]);

        for (int i = 1; i < array.length; i++) {
            int divisorsCount = countDivisors(array[i]);
            if (divisorsCount > maxDivisorsCount || (divisorsCount == maxDivisorsCount && array[i] > maxDivisorsNumber)) {
                maxDivisorsCount = divisorsCount;
                maxDivisorsNumber = array[i];
            }
        }

        return maxDivisorsNumber;
    }
}

    
