package sort;

public class ShellSort {

    /**
     * Shell Sort:
     * Best: Ω(n log(n)) 
     * Average: Θ(n(log(n))^2)
     * Worst: O(n(log(n))^2)
     * 
     * @param {int[] Array} arr
     */
    public static void shellSort(int[] arr) {
        int incr = 1;
        while (2 * incr <= arr.length)
            incr = 2 * incr;
        incr = incr - 1;

        /* Do insertion sort for each increment. */
        while (incr >= 1) {
            for (int i = incr; i < arr.length; i++) {
                if (arr[i] < arr[i-incr]) {
                    int toInsert = arr[i];

                    int j = i;
                    do {
                        arr[j] = arr[j - incr];
                        j = j - incr;
                    } while (j > incr-1 &&
                      toInsert < arr[j-incr]);

                    arr[j] = toInsert;
                }
            }

            // Calculate increment for next pass.
            incr = incr / 2;
        }
    }
}
