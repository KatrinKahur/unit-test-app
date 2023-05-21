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
package sorts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

final class SortUtils {

    /**
     * Swaps two elements at the given positions in an array.
     *
     * @param array the array in which to swap elements
     * @param i     the index of the first element to swap
     * @param j     the index of the second element to swap
     * @param <T>   the type of elements in the array
     */
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Compares two elements to see if the first is less than the second.
     *
     * @param firstElement  the first element to compare
     * @param secondElement the second element to compare
     * @return true if the first element is less than the second, false otherwise
     */
    public static <T extends Comparable<T>> boolean less(T firstElement, T secondElement) {
        return firstElement.compareTo(secondElement) < 0;
    }

    /**
     * Compares two elements to see if the first is greater than the second.
     *
     * @param firstElement  the first element to compare
     * @param secondElement the second element to compare
     * @return true if the first element is greater than the second, false otherwise
     */
    public static <T extends Comparable<T>> boolean greater(T firstElement, T secondElement) {
        return firstElement.compareTo(secondElement) > 0;
    }

    /**
     * Compares two elements to see if the first is greater than or equal to the second.
     *
     * @param firstElement  the first element to compare
     * @param secondElement the second element to compare
     * @return true if the first element is greater than or equal to the second, false otherwise
     */
    static <T extends Comparable<T>> boolean greaterOrEqual(T firstElement, T secondElement) {
        return firstElement.compareTo(secondElement) >= 0;
    }

    /**
     * Prints the elements of a list to standard output.
     *
     * @param listToPrint the list to print
     */
    static void print(List<?> listToPrint) {
        String result = listToPrint.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

    /**
     * Prints the elements of an array to standard output.
     *
     * @param array the array to print
     */
    static <T> void print(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Flips the order of elements in the specified range of an array.
     *
     * @param array the array whose elements are to be flipped
     * @param left  the left boundary of the range to be flipped (inclusive)
     * @param right the right boundary of the range to be flipped (inclusive)
     */
    public static <T extends Comparable<T>> void flip(T[] array, int left, int right) {
        while (left <= right) {
            swap(array, left++, right--);
        }
    }

    /**
     * Checks whether the array is sorted in ascending order.
     *
     * @param array the array to check
     * @return true if the array is sorted in ascending order, false otherwise
     */
    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks whether the list is sorted in ascending order.
     *
     * @param list the list to check
     * @return true if the list is sorted in ascending order, false otherwise
     */
    public static <T extends Comparable<T>> boolean isSorted(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            if (less(list.get(i), list.get(i - 1))) {
                return false;
            }
        }
        return true;
    }
}
