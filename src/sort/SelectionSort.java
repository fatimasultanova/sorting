package sort;

import sort.inter.Sorting;

public class SelectionSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        int i, j, small;
        int n = arr.length;
        for (i = 0; i < n-1; i++) {
            small = i;

            for (j = i+1; j < n; j++) {
                if (arr[j] < arr[small])
                    small = j;
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}
