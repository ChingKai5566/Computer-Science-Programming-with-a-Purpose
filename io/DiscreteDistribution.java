/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        int[] a = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        // cumulative sums
        int[] c = new int[a.length + 1];
        c[0] = 0;
        for (int i = 0; i < c.length - 1; i++) {
            c[i + 1] = c[i] + a[i];
        }

        for (int i = 0; i < m; i++) {
            int g = (int) (c[c.length - 1] * Math.random());

            for (int j = 0; j < c.length - 1; j++) {
                if (g >= c[j] && g < c[j + 1]) {
                    System.out.print(j + 1 + " ");
                }
            }
        }
    }
}
