package sort;

public class SelectionSort {

    /**
     * Selection Sort:
     * Best: Ω(n^2) 
     * Average: Θ(n^2)
     * Worst: O(n^2)
     * 
     * @param {int[] Array} arr
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = SortUtil.indexSmallest(arr, i, arr.length - 1);
            SortUtil.swap(arr, i, j);
        }
    }
}
