package sort;

public class MergeSort {

    /**
     * Mergesort:
     * Best: Ω(n log(n)) 
     * Average: Θ(n log(n))
     * Worst: O(n log(n))
     * 
     * @param {int[] Array} arr
     */
    public static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length];
        mSort(arr, tmp, 0, arr.length - 1);
    }
    
    private static void mSort(int[] arr, int[] tmp, int start, int end) {
        if (start >= end)
            return;

        int middle = (start + end)/2;
        mSort(arr, tmp, start, middle);
        mSort(arr, tmp, middle + 1, end);
        merge(arr, tmp, start, middle, middle + 1, end);
    }
    
    private static void merge(int[] arr, int[] tmp,
      int leftStart, int leftEnd, int rightStart, int rightEnd)
    {
        int i = leftStart;    
        int j = rightStart;   
        int k = leftStart;   

        while (i <= leftEnd && j <= rightEnd) {
            if (arr[i] < arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }

        while (i <= leftEnd)
            tmp[k++] = arr[i++];

        while (j <= rightEnd)
            tmp[k++] = arr[j++];

        for (i = leftStart; i <= rightEnd; i++)
            arr[i] = tmp[i];
    }
}
