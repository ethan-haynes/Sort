package sort;

class SortUtil {

    /*
     * swap - swap the values of two variables.
     * Used by several of the sorting algorithms below.
     */
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /*
     * indexSmallest - returns the index of the smallest element
     * in the subarray from arr[lower] to arr[upper].  Used by
     * selectionSort.
     */
    static int indexSmallest(int[] arr, int lower, int upper) {
        int indexMin = lower;

        for (int i = lower+1; i <= upper; i++)
            if (arr[i] < arr[indexMin])
                indexMin = i;

        return indexMin;
    }
}
