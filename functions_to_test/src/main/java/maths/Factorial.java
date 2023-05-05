package maths;

public class Factorial {

    /**
     * Calculate factorial N using iteration
     *
     * @param n the number
     * @return the factorial of {@code n}
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("number is negative");
        }
        long factorial = 1;
        for (int i = 1; i <= n; factorial *= i, ++i);
        return factorial;
    }
}
