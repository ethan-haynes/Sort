package sort;

public class InsertionSort {

    /**
     * Insertion Sort:
     * Best: Ω(n) 
     * Average: Θ(n^2)
     * Worst: O(n^2)
     * 
     * @param {int[] Array} arr
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                // Save a copy of the element to be inserted.
                int toInsert = arr[i];

                // Shift right to make room for element.
                int j = i;
                do {
                    arr[j] = arr[j - 1];
                    j = j - 1;
                } while (j > 0 && toInsert < arr[j-1]);

                // Put the element in place.
                arr[j] = toInsert;
            }
        }
    }
}
