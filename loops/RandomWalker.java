/* *****************************************************************************
 *  Name:              Ching-Kai
 *  Coursera User ID:  5566
 *  Last modified:     12/17/2019
 ****************************************************************************
 */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int step = 0;
        System.out.println("(" + x + ", " + y + ")");
        int d = 0;
        while (d != r) {


            double s = (int) (4 * Math.random());
            if (s == 0) {
                x = x + 1;
            }
            else if (s == 1) {
                x = x - 1;
            }
            else if (s == 2) {
                y = y + 1;
            }
            else {
                y = y - 1;
            }


            d = Math.abs(x) + Math.abs(y);
            System.out.println("(" + x + ", " + y + ")");
            step++;


        }

        System.out.println("steps = " + step);

    }
}
