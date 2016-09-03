package sort;

public class QuickSort {
    

    /**
     * Quicksort:
     * Best: Ω(n log(n)) 
     * Average: Θ(n log(n))
     * Worst: O(n^2)
     * 
     * @param {int[] Array} arr
     */
    public static void quickSort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
    }
    
    /* qSort - recursive method that does the work for quickSort */
    private static void qSort(int[] arr, int first, int last) {
        int split = partition(arr, first, last);

        if (first < split)
            qSort(arr, first, split);      // left subarray
        if (last > split + 1)
            qSort(arr, split + 1, last);   // right subarray
    }
    
    /* partition - helper method for qSort */
    private static int partition(int[] arr, int first, int last) {
        int pivot = arr[(first + last)/2];
        int i = first - 1;  // index going left to right
        int j = last + 1;   // index going right to left

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);

            if (i < j)
                SortUtil.swap(arr, i, j);
            else
                return j;   // index of last element in the left subarray
        }
    }
}
