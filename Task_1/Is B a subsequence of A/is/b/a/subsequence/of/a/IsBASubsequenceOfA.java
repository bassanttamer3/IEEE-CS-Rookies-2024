
package is.b.a.subsequence.of.a;

import java.util.Scanner;

public class IsBASubsequenceOfA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        boolean isSubsequence = isSubsequence(a, b, n, m);

        if (isSubsequence) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isSubsequence(int[] a, int[] b, int n, int m) {
        int i = 0, j = 0;

        while (i < n && j < m) {
            if (a[i] == b[j]) {
                j++;
            }
            i++;
        }
        return (j == m);
    }
}
