/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 ****************************************************************************
 */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        double sum = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int d = 0;
            int step = 0;
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
                //System.out.println(step + " step: " + "(" + x + ", " + y + ")");
                step++;
            }
            sum += step;
            //System.out.println(i);
        }
        double a = sum / trials;
        System.out.println("average number of steps = " + a);
    }
}
