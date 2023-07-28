package Sort;

import java.util.Arrays;

public class QuickSort {
    public static int[] sort(int[] arr) {
        int[] res = arr.clone();
        sort(res, 0, res.length - 1);

        return res;
    }

    private static void sort(int[] arr, int start, int end) {
        if (end - start <= 0) return;

        int pivot = partition(arr, start, end);
        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivotVal = arr[start];  // The value to partition the array by, could be any value between start and end
        int pivotInd = start;   // The index of the pivot, for swapping latter
        int firstBigger = start;    // Stores the position of the first element bigger than the pivot

        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivotVal) {
                swap(arr, i, firstBigger);
                if (i == pivotInd) pivotInd = firstBigger; // Update the pivot index since we're swapping the pivot with firstBigger
                firstBigger++;  // Update pointer because we've placed an element smaller than pivot behind this pointer
            }
        }
        swap(arr, pivotInd, firstBigger - 1);   // Final swap to put pivot in place
        return firstBigger - 1;   // This is returning the pivot since we've swapped pivot with k-1
    }

    private static void swap(int[] arr, int i1, int i2) {
        if (i1 == i2 || arr[i1] == arr[i2]) return;

        arr[i1] = arr[i1] + arr[i2];
        arr[i2] = arr[i1] - arr[i2];
        arr[i1] = arr[i1] - arr[i2];
    }

    public static void display(int[] arr) {
        System.out.println("Quick Sort: " + Arrays.toString(sort(arr)));
    }
}
