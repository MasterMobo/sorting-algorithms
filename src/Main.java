import Sort.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = RandomArr.generate(10, 200);
        System.out.println("Unsorted: " + Arrays.toString(arr));
        BubbleSort.display(arr);
        SelectionSort.display(arr);
        QuickSort.display(arr);
    }
}