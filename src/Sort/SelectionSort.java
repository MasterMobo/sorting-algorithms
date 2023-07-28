package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[] arr) {
        int[] res = arr.clone();

        for (int i = 0; i < res.length; i++) {
            swapMin(res, i);
        }

        return res;
    }

    public static void swapMin(int[] arr, int start) {
        // Swap the minimum element with the first element
        int minIndex = minIndex(arr, start);
        swap(arr, start, minIndex);
    }

    public static int minIndex(int[] arr, int start) {
        int res = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[res]) res = i;
        }

        return res;
    }

    private static void swap(int[] arr, int i1, int i2) {
        if (i1 == i2 || arr[i1] == arr[i2]) return;

        arr[i1] = arr[i1] + arr[i2];
        arr[i2] = arr[i1] - arr[i2];
        arr[i1] = arr[i1] - arr[i2];
    }

    public static void display(int[] arr) {
        System.out.println("Selection Sort: " + Arrays.toString(sort(arr)));
    }
}
