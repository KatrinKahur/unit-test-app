package conversions;

/**
 * Converts any Hexadecimal Number to Octal
 *
 * @author Tanmay Joshi
 */
public class HexToOct {

    /**
     * This method converts a Hexadecimal number to a decimal number
     *
     * @param s The Hexadecimal Number
     * @return The Decimal number
     */
    public static int hex2decimal(String s) {
        String str = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            int n = str.indexOf(a);
            val = 16 * val + n;
        }
        return val;
    }

    /**
     * This method converts a Decimal number to a octal number
     *
     * @param q The Decimal Number
     * @return The Octal number
     */
    public static int decimal2octal(int q) {
        int now;
        int i = 1;
        int octnum = 0;
        while (q > 0) {
            now = q % 8;
            octnum = (now * (int) (Math.pow(10, i))) + octnum;
            q /= 8;
            i++;
        }
        octnum /= 10;
        return octnum;
    }
}
