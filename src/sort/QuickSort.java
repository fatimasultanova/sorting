package sort;

import sort.inter.Sorting;

public class QuickSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    private void quickSort(int[] arr, int low, int high) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, j, ++i);
            }
        }
        return i;
    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[j] = arr[i];
        arr[j] = temp;
    }
}
