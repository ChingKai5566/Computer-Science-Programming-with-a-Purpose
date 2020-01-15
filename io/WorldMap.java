/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 ****************************************************************************
 */

public class WorldMap {
    public static void main(String[] args) {

        int w = StdIn.readInt();
        int h = StdIn.readInt();

        StdDraw.setCanvasSize(w, h);
        StdDraw.setXscale(0, w);
        StdDraw.setYscale(0, h);


        while (!StdIn.isEmpty()) {
            String r = StdIn.readString();
            int v = StdIn.readInt();
            double[] x = new double[v];
            double[] y = new double[v];
            for (int i = 0; i < v; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }


    }
}

