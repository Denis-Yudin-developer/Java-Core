package main.java.Ylab.tasks.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5,6,3,2,5,1,4,9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array after quicksort: " + Arrays.toString(arr));

        int[] customSortArr = new int[]{9,7,9,1,1,13,5,14,9};
        int[] builtInSortArr = new int[]{9,7,9,1,1,13,5,14,9};
        quickSort(customSortArr, 0, customSortArr.length - 1);
        Arrays.sort(builtInSortArr);
        for (int i = 0; i < customSortArr.length; i++) {
            assert customSortArr[i] == builtInSortArr[i];
        }
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= 0 && hi >= 0 && lo < hi) {
            int p = hoare_partition(arr, lo, hi);
            quickSort(arr, lo, p);
            quickSort(arr, p + 1, hi);
        }
    }

    private static int hoare_partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int i = lo - 1;
        int j = hi + 1;

        while (true) {
            do {
                i++;
            }
            while (arr[i] < pivot);

            do {
                j--;
            }
            while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
