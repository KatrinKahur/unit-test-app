package searches;

import devutils.SearchAlgorithm;

/*
 *  Fibonacci Search is a popular algorithm which finds the position of a target value in
 *  a sorted array
 *
 *  The time complexity for this search algorithm is O(log3(n))
 *  The space complexity for this search algorithm is O(1)
 *  @author Kanakalatha Vemuru (https://github.com/KanakalathaVemuru)
 */
public class FibonacciSearch implements SearchAlgorithm {

    /**
     * @param array is a sorted array where the element has to be searched
     * @param key is an element whose position has to be found
     * @param <T> is any comparable type
     * @return index of the element
     */
    @Override
    public <T extends Comparable<T>> int find(T[] array, T key) {
        int fibMinus1 = 1;
        int fibMinus2 = 0;
        int fibNumber = fibMinus1 + fibMinus2;
        int n = array.length;

        while (fibNumber < n) {
            fibMinus2 = fibMinus1;
            fibMinus1 = fibNumber;
            fibNumber = fibMinus2 + fibMinus1;
        }

        int offset = -1;

        while (fibNumber > 1) {
            int i = Math.min(offset + fibMinus2, n - 1);

            if (array[i].compareTo(key) < 0) {
                fibNumber = fibMinus1;
                fibMinus1 = fibMinus2;
                fibMinus2 = fibNumber - fibMinus1;
                offset = i;
            } else if (array[i].compareTo(key) > 0) {
                fibNumber = fibMinus2;
                fibMinus1 = fibMinus1 - fibMinus2;
                fibMinus2 = fibNumber - fibMinus1;
            } else {
                return i;
            }
        }

        if (fibMinus1 == 1 && array[offset + 1] == key) {
            return offset + 1;
        }

        return -1;
    }
}
