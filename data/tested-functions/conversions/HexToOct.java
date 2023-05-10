/**
 * MIT License
 *
 * Copyright (c) 2021 The Algorithms
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * Modified by Katrin Kahur
 * Date: May 2nd, 2023
 */
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
