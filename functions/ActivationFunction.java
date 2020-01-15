/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *******************************************************************************
 */

public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {

        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        else if (x == 0) {
            return 0.5;
        }
        else if (x > 0) {
            return 1;
        }
        else {
            return 0;
        }

    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {

        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        else {
            return 1 / (1 + Math.exp(x * (-1)));
        }

    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {

        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        else if (x >= 20) {
            return 1;
        }
        else if (x <= -20) {
            return -1;
        }
        else {
            double i = Math.exp(x);
            double j = Math.exp(x * (-1));
            return (i - j) / (i + j);
        }

    }

    // Returns the softsign function of x.
    public static double softsign(double x) {

        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        else if (x == Double.POSITIVE_INFINITY) {
            return 1;
        }
        else if (x == Double.NEGATIVE_INFINITY) {
            return -1;
        }
        else {
            return x / (1 + Math.abs(x));
        }

    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {

        if (Double.isNaN(x)) {
            return Double.NaN;
        }
        else if (x <= -2) {
            return -1;
        }
        else if (x < 0) {
            return x + Math.pow(x, 2) / 4;
        }
        else if (x < 2) {
            return x - Math.pow(x, 2) / 4;
        }
        else {
            return 1;
        }

    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {

        double x = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + x + ") = " + heaviside(x));
        StdOut.println("  sigmoid(" + x + ") = " + sigmoid(x));
        StdOut.println("     tanh(" + x + ") = " + tanh(x));
        StdOut.println(" softsign(" + x + ") = " + softsign(x));
        StdOut.println("     sqnl(" + x + ") = " + sqnl(x));

    }

}
