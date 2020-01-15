/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Thue size m
        int m = 1;
        while (n > m) {
            m = m * 2;
        }

        int[] thue = new int[m];
        for (int i = 0; i < thue.length; i++) {
            if (i == 0) {
                thue[i] = 0;
            }
            else if (i % 2 == 0) {
                thue[i] = thue[i / 2];
            }
            else {
                thue[i] = 1 - thue[i - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thue[i] == thue[j]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }

    }
}
