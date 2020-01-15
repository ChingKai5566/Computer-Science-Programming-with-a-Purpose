/* *****************************************************************************
 *  Name:              Ching-Kai Hung
 *  Coursera User ID:  5566
 *  Last modified:     12/16/2019
 *****************************************************************************
 */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isTriangle = (a * a + b * b == c * c || b * b + c * c == a * a
                || a * a + c * c == b * b) && a > 0 && b > 0 && c > 0;
        System.out.println(isTriangle);

    }
}
