package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] arr) {
        int[] res = arr.clone();

        for (int i = 0; i < res.length; i++) {
            boolean hasSwapped = false;
            for (int j = 0; j < res.length - i - 1; j++) {
                if (res[j] > res[j + 1]) {
                    swap(res, j, j + 1);
                    hasSwapped = true;
                }
            }
            if (!hasSwapped) return res;    // If we go through the array without swapping, the array is already sorted
        }

        return res;
    }

    private static void swap(int[] arr, int i1, int i2) {
        arr[i1] = arr[i1] + arr[i2];
        arr[i2] = arr[i1] - arr[i2];
        arr[i1] = arr[i1] - arr[i2];
    }

    public static void display(int[] arr) {
        System.out.println("Selection Sort: " + Arrays.toString(sort(arr)));
    }
}
