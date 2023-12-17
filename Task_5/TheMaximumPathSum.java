package the.maximum.path.sum;
import java.util.Scanner;

public class TheMaximumPathSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long a[][] = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextLong();
            }
        }
        long result = max(a);
        System.out.println(result);
    }

    public static long max(long[][] a) {
        int n = a.length;
        int m = a[0].length;

       
        long[][] res = new long[n][m];
        res[0][0] = a[0][0];

        for (int j = 1; j < m; j++) {
            res[0][j] = res[0][j - 1] + a[0][j];
        }

        for (int i = 1; i < n; i++) {
            res[i][0] = res[i - 1][0] + a[i][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                res[i][j] = a[i][j] + Math.max(res[i - 1][j], res[i][j - 1]);
            }
        }

        return res[n - 1][m - 1];
    }
}
