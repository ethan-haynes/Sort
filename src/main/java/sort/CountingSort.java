package sort;

public class CountingSort {
    
    
    /**
     * Counting Sort:  O(n+k)
     * Best: Ω(n+k) 
     * Average: Θ(n+k)
     * Worst: O(n+k)
     * 
     * @param {int[] Array} arr
     */
    public static void countingSort(int[] arr) {
        int l = arr.length;
        int[]  temp = minMax(arr),
              count = cSort(arr, temp[0], temp[l-1]);
        
        for (int i = 1; i < count.length; i++)
            count[i] += count[i-1];
        
        for (int i = 0; i < l; i++)
            arr[count[temp[i] - temp[0]]--] = temp[i];
    }
    
    private static int[] cSort(int[] arr, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int i : arr)
            count[i - min]++;
            count[0]--;
            
        return count;
    }
    
    private static int[] minMax(int[] arr) {
        int[] out = new int[arr.length];
        int min = 0,
            max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            } else if (arr[i] > arr[max]) {
                max = i;
            }
            out[i] = arr[i]; 
        }

        SortUtil.swap(out, 0, min);
        if (arr.length-1 != min) 
            SortUtil.swap(out, arr.length-1, max);
        
        return out;
    }
}
