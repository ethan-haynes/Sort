package sort;

public class BubbleSort {

    /**
     * Bubble Sort:  
     * Best: Ω(n)
     * Average: Θ(n^2)
     * Worst: O(n^2)
     * 
     * @param {int[] Array} arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1])
                    SortUtil.swap(arr, j, j+1);
            }
        }
    }
}
