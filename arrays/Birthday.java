/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);


        int[] count = new int[1];

        for (int i = 0; i < trials; i++) {
            boolean[] isBday = new boolean[n];
            int p = 0;
            do {
                p++;
                int bday = (int) (Math.random() * n);
                if (!isBday[bday]) {
                    isBday[bday] = true;
                } else {
                    break;
                }
            } while (true);

            if (p > count.length) {
                int[] newcount = new int[p];
                for (int j = 0; j < count.length; j++) {
                    newcount[j] = count[j];
                }
                count = newcount;
            }

            count[p - 1] += 1;

        }



        double prob = 0;
        int c = 0;
        while (prob < 0.5) {
            prob += (double) count[c] / trials;
            System.out.println(c + 1 + "\t" + count[c] + "\t" + prob);
            c++;
        }



    }




}
