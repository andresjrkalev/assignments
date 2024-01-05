package ee.assignments.mergesort;

/**
 * Reference: https://en.wikipedia.org/wiki/Merge_sort
 *
 * Custom integer array merge sort algorithm
 */
public class ArraySort {

    /**
     * Creates a copy of an input array and starts division
     *
     * @param array - represents input array what will be sorted
     * @return - returns sorted array
     */
    public int[] mergeSort(int[] array) {
        int[] copyOfArray = array.clone();
        divide(array, 0, array.length, copyOfArray);
        return array;
    }

    /**
     * Divides array into the smallest parts for sorting
     *
     * @param array - represents input array what will be sorted
     * @param begin - represents index where the sorting would start from
     * @param end - represents index where the sorting would end till
     * @param copyOfArray - represents array what is a copy of input array
     */
    private void divide(int[] array, int begin, int end, int[] copyOfArray) {
        int divisionSize = end - begin;
        if (divisionSize <= 1) return;
        int middle = (begin + end) / 2;
        divide(copyOfArray, begin, middle, array);
        divide(copyOfArray, middle, end, array);
        merge(array, begin, middle, end, copyOfArray);
    }

    /**
     * Switch element positions in array
     *
     * @param array - represents input array what will be sorted
     * @param begin - represents index where the sorting would start from
     * @param middle - represents input array middle element index
     * @param end - represents index where the sorting would end till
     * @param copyOfArray - represents array what is a copy of input array for comparing integers
     */
    private void merge(int[] array, int begin, int middle, int end, int[] copyOfArray) {
        int i = begin;
        int j = middle;

        for (int k = begin; k < end; k++) {
            if (i < middle && (j >= end || copyOfArray[i] <= copyOfArray[j])) {
                array[k] = copyOfArray[i];
                i++;
            } else {
                array[k] = copyOfArray[j];
                j++;
            }
        }
    }
}
