/* *****************************************************************************
 *  Name:              Ching-Kai
 *  Coursera User ID:  5566
 *  Last modified:     12/17/2019
 *******************************************************************************
 * */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int w = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
            for (int j = 0; j < n; j++) {
                if (i == j || Math.abs(i - j) <= w) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("0 ");
                }
            }

            System.out.println();
        }

    }
}
