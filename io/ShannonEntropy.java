/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *******************************************************************************
 */
public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        // int z = 1;
        // int[] n = new int[z];
        //
        // n[0] = StdIn.readInt();
        // while (!StdIn.isEmpty()) {
        //     // z++;
        //     // int[] t = new int[z];
        //     // for (int i = 0; i < n.length; i++) {
        //     //     t[i] = n[i];
        //     // }
        //     // t[z - 1] = StdIn.readInt();
        //     // n = t;
        // }
        int[] n = StdIn.readAllInts();
        // print(n);

        // int[] items = new int[m];
        // for (int i = 0; i < m; i++) {
        //     items[i] = i + 1;
        // }

        // print(items);

        double sum = 0;
        int[] checki = new int[m];
        for (int i = 0; i < n.length; i++) {
            if (n[i] <= m) {
                checki[n[i] - 1]++;
                sum++;
            }
        }

        // print(checki);
        // System.out.println(sum);

        double sump = 0;
        double[] p = new double[m];
        for (int i = 0; i < m; i++) {
            if (checki[i] != 0) {
                p[i] = checki[i] / sum;
                p[i] = (-1) * p[i] * Math.log(p[i]) / Math.log(2);
                sump += p[i];
            }
        }

        // print(p);
        StdOut.printf("%.4f\n", sump);

    }

    // public static void print(double[] a) {
    //     for (int i = 0; i < a.length; i++) {
    //         System.out.print(a[i] + " ");
    //     }
    //     System.out.println();
    // }
    //
    // public static void print(int[] a) {
    //     for (int i = 0; i < a.length; i++) {
    //         System.out.print(a[i] + " ");
    //     }
    //     System.out.println();
    //     // }
    // }
}


