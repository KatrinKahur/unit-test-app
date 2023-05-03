package conversions;

import java.util.Scanner;

/**
 * This class converts a Binary number to a Decimal number
 */
class BinaryToDecimal {

    public static long binaryToDecimal(long binNum) {
        long binCopy, d, s = 0, power = 0;
        binCopy = binNum;
        while (binCopy != 0) {
            d = binCopy % 10;
            s += d * (long) Math.pow(2, power++);
            binCopy /= 10;
        }
        return s;
    }

    /**
     * Main Method
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binary number: ");
        System.out.println("Decimal equivalent:" + binaryToDecimal(sc.nextLong()));
        sc.close();
    }
}
