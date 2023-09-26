package sort;

import sort.inter.Sorting;

public class MergeSort implements Sorting {
    @Override
    public void sort(int[] arr) {
        if (arr.length < 2) {return;}
        int midIndex = arr.length / 2;
        int[] leftArr = new int[midIndex];
        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[i];
        }
        int[] rightArr = new int[arr.length - midIndex];
        for (int i = midIndex; i < arr.length; i++) {
            rightArr[i - midIndex] = arr[i];
        }
        sort(leftArr);
        sort(rightArr);
        merge(arr, leftArr, rightArr);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                arr[k] = right[j++];
            } else {
                arr[k] = left[i++];
            }
            k++;
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    }

