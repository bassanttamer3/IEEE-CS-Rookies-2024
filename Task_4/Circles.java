
package circles;
import java.util.Scanner;

public class Circles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double Y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double Y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double Y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double Y4 = sc.nextDouble();

        double midx1 = (x1 + x2) / 2.0;
        double midy1 = (Y1 + Y2) / 2.0;
        double midx2 = (x3 + x4) / 2.0;
        double midy2 = (Y3 + Y4) / 2.0;

        double r1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(Y1 - Y2, 2)) / 2.0;
        double r2 = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(Y3 - Y4, 2)) / 2.0;
        double line = Math.sqrt(Math.pow(midx1 - midx2, 2) + Math.pow(midy1 - midy2, 2));
        double rr = r1 + r2;

        if (line > rr) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
