
package common.area;

import java.util.Scanner;

public class CommonArea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); 

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = sc.nextInt(); 

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int intersectionArea = IntersectionArea(x1, y1, x2, y2);

            for (int i = 1; i < N; i++) {
                x1 = Math.max(x1, sc.nextInt());
                y1 = Math.max(y1, sc.nextInt());
                x2 = Math.min(x2, sc.nextInt());
                y2 = Math.min(y2, sc.nextInt());

                intersectionArea =IntersectionArea(x1, y1, x2, y2);
            }

            System.out.println("Case #" + testCase + ": " + intersectionArea);
        }

       
    }

    private static int IntersectionArea(int x1, int y1, int x2, int y2) {
        int width = Math.max(0, x2 - x1);
        int height = Math.max(0, y2 - y1);
        return width * height;
    }
}