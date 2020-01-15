/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        char[][] map = new char[m + 2][n + 2];
        int[] num = new int[m * n];

        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }

        for (int i = 0; i < k; i++) {
            int mine = i + (int) (Math.random() * (m * n - i));
            int t = num[mine];
            num[mine] = num[i];
            num[i] = t;
            map[t / n + 1][t % n + 1] = '*';
        }



        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (map[i][j] != '*') {
                    int c = 0;
                    if (map[i - 1][j - 1] == '*') {
                        c++;
                    }
                    if (map[i - 1][j] == '*') {
                        c++;
                    }
                    if (map[i - 1][j + 1] == '*') {
                        c++;
                    }
                    if (map[i][j - 1] == '*') {
                        c++;
                    }
                    if (map[i][j + 1] == '*') {
                        c++;
                    }
                    if (map[i + 1][j - 1] == '*') {
                        c++;
                    }
                    if (map[i + 1][j] == '*') {
                        c++;
                    }
                    if (map[i + 1][j + 1] == '*') {
                        c++;
                    }
                    map[i][j] = (char)(c+'0');
                }
            }
        }

        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
