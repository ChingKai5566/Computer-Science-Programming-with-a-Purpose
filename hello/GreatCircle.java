/* *****************************************************************************
 *  Name:              Ching-Kai Hung
 *  Coursera User ID:  5566
 *  Last modified:     12/16/2019
 *******************************************************************************
 */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double a = (x2 - x1) / 2;
        double b = (y2 - y1) / 2;

        double d = 2 * 6371.0 * Math
                .asin(Math.sqrt((Math.pow(Math.sin(a), 2)) + Math.cos(x1) * Math.cos(x2) * Math
                        .pow(Math.sin(b), 2)));

        System.out.println(d + " kilometers");

    }
}
