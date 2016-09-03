package sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;


public class SortTest {
    int[] a;
    int[] b;
    int[] c;
    int[] d;
    
    @Before
    public void setUp() throws Exception{
        a = new int[]{1,2,3,4,5,6,7,8,9,10}; //expected
        b = new int[]{10,9,8,7,6,5,4,3,2,1}; //actual
        
        c = new int[]{2,6,8,9,16,17,21,33,88,100,111}; //expected
        d = new int[]{16,2,88,33,111,6,100,21,17,9,8}; //actual
    }
    
    @Test
    public void testBubbleSort() {
        BubbleSort.bubbleSort(b);
        BubbleSort.bubbleSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testInsertionSort() {
        InsertionSort.insertionSort(b);
        InsertionSort.insertionSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testMergeSort() {
        MergeSort.mergeSort(b);
        MergeSort.mergeSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testQuickSort() {
        QuickSort.quickSort(b);
        QuickSort.quickSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testSelectSort() {
        SelectionSort.selectionSort(b);
        SelectionSort.selectionSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testShellSort() {
        ShellSort.shellSort(b);
        ShellSort.shellSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testCountSort() {
        CountingSort.countingSort(b);
        CountingSort.countingSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
}
