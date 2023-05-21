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

import java.util.*;

/**
 * Converts any Binary Number to a Hexadecimal Number
 *
 * @author Nishita Aggarwal
 */
public class BinaryToHexadecimal {

    /**
     * This method converts a binary number to a hexadecimal number.
     *
     * @param binary The binary number
     * @return The hexadecimal number
     */
    static String binToHex(int binary) {
        // hm to store hexadecimal codes for binary numbers within the range: 0000 to 1111 i.e. for
        // decimal numbers 0 to 15
        HashMap<Integer, String> hm = new HashMap<>();
        // String to store hexadecimal code
        String hex = "";
        int i;
        for (i = 0; i < 10; i++) {
            hm.put(i, String.valueOf(i));
        }
        for (i = 10; i < 16; i++) {
            hm.put(i, String.valueOf((char) ('A' + i - 10)));
        }
        int currbit;
        while (binary != 0) {
            int code4 = 0; // to store decimal equivalent of number formed by 4 decimal digits
            for (i = 0; i < 4; i++) {
                currbit = binary % 10;
                binary = binary / 10;
                code4 += currbit * Math.pow(2, i);
            }
            hex = hm.get(code4) + hex;
        }
        return hex;
    }
}
