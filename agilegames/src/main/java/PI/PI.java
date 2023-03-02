package PI;

public class PI {

    public static void main(String[] args) {
        System.out.println(calculatePi(3));
    }

    public static double calculatePi(int numDigits) {
        if (numDigits < 0) {
            throw new IllegalArgumentException("Number of digits .");
        }

        double pi = 3.0;
        double term = 0.0;
        double denominator = 2.0;
        int i = 0;

        while (i < numDigits) {
            term = 4.0 / (denominator * (denominator + 1.0) * (denominator + 2.0));
            if (i % 2 == 0) {
                pi += term;
            } else {
                pi -= term;
            }
            denominator += 2.0;
            i++;
        }

        return round(pi, numDigits);
    }

    private static double round(double value, int numDigits) {
        double scale = Math.pow(10, numDigits);
        return Math.round(value * scale) / scale;
    }
}
