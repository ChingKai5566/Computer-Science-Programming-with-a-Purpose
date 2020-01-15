/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class AudioCollage {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            b[a.length - 1 - i] = a[i];
        }
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] m = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            m[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            m[a.length + i] = b[i];
        }
        return m;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int size = Math.max(a.length, b.length);
        double[] m = new double[size];
        for (int i = 0; i < size; i++) {
            if (i >= a.length) {
                m[i] = b[i];
            }
            else if (i >= b.length) {
                m[i] = a[i];
            }
            else {
                m[i] = a[i] + b[i];
            }
        }
        return m;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] c = new double[(int) (a.length / alpha)];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[(int) (i * alpha)];
        }
        return c;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] a = StdAudio.read("beatbox.wav");
        double[] b = StdAudio.read("buzzer.wav");
        StdAudio.play(a);
        double[] amp = amplify(a, 50);
        StdAudio.play(amp);
        double[] rev = reverse(a);
        StdAudio.play(rev);
        double[] merge = merge(a, b);
        StdAudio.play(merge);
        double[] mix = mix(a, b);
        StdAudio.play(mix);
        double[] cs = changeSpeed(b, 10);
        StdAudio.play(cs);
    }
}
