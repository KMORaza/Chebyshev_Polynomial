package Chebyshev_Polynomial;
import java.util.Arrays;
public class ChebyshevPolynomial {
    private int degree;
    private double[] coefficients;
    public ChebyshevPolynomial(int degree, double[] coefficients) {
        if (coefficients.length != degree + 1) {
            throw new IllegalArgumentException("Number of coefficients should be equal to degree + 1");
        }
        this.degree = degree;
        this.coefficients = Arrays.copyOf(coefficients, degree + 1);
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = degree; i >= 0; i--) {
            result = result * x + coefficients[i];
        }
        return result;
    }
    public double[] calculateRoots() {
        double[] roots = new double[degree];
        for (int k = 1; k <= degree; k++) {
            roots[k - 1] = Math.cos((2.0 * k - 1.0) * Math.PI / (2.0 * degree));
        }
        return roots;
    }
    public int getDegree() {
        return degree;
    }
    public double[] getCoefficients() {
        return Arrays.copyOf(coefficients, degree + 1);
    }
}