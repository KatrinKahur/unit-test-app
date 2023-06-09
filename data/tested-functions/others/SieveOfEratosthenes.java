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
package others;

import java.util.Arrays;

/**
 * Sieve of Eratosthenes is an ancient algorithm for finding all prime numbers
 * up to any given limit.
 *
 * @see <a href="https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes">Wiki</a>
 */
public class SieveOfEratosthenes {

    /**
     * Finds all prime numbers till n.
     *
     * @param n The number till which we have to check for primes. Should be more than 1.
     * @return Array of all prime numbers between 0 to n.
     */
    public static int[] findPrimesTill(int n) {
        Type[] numbers = new Type[n + 1];
        Arrays.fill(numbers, Type.PRIME);
        numbers[0] = numbers[1] = Type.NOT_PRIME;

        double cap = Math.sqrt(n);
        for (int i = 2; i <= cap; i++) {
            if (numbers[i] == Type.PRIME) {
                for (int j = 2; i * j <= n; j++) {
                    numbers[i * j] = Type.NOT_PRIME;
                }
            }
        }

        int primesCount = (int) Arrays
            .stream(numbers)
            .filter(element -> element == Type.PRIME)
            .count();
        int[] primes = new int[primesCount];

        int primeIndex = 0;
        for (int i = 0; i < n + 1; i++) {
            if (numbers[i] == Type.PRIME) {
                primes[primeIndex++] = i;
            }
        }

        return primes;
    }

    private enum Type {
        PRIME,
        NOT_PRIME,
    }
}
