/* *****************************************************************************
 *  Name:              Ching-Kai
 *  Coursera User ID:  5566
 *  Last modified:     12/17/2019
 *******************************************************************************
 */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (1 / Math.pow(i, r));
        }

        System.out.println(sum);
    }
}

