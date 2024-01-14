package Chebyshev_Polynomial;
import java.util.Scanner;
import java.util.Arrays;
public class ChebyshevEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the degree of the Chebyshev polynomial: ");
        int degree = scanner.nextInt();

        double[] coefficients = new double[degree + 1];
        System.out.println("Enter the coefficients of the Chebyshev polynomial:");
        for (int i = degree; i >= 0; i--) {
            System.out.print("Coefficient for x^" + i + ": ");
            coefficients[i] = scanner.nextDouble();
        }

        ChebyshevPolynomial polynomial = new ChebyshevPolynomial(degree, coefficients);

        // Evaluate the polynomial at user-specified x
        System.out.print("Enter the value of x for evaluation: ");
        double x = scanner.nextDouble();
        double result = polynomial.evaluate(x);
        System.out.println("T_" + degree + "(" + x + ") = " + result);

        // Calculate and display the roots of the polynomial
        double[] roots = polynomial.calculateRoots();
        System.out.println("Roots of T_" + degree + "(x): " + Arrays.toString(roots));

        scanner.close();
    }
}
