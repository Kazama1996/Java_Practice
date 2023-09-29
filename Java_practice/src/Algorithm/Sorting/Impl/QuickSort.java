package Algorithm.Sorting.Impl;

import Algorithm.Sorting.Sorting;

public class QuickSort extends Sorting{
    public int partition(int[] input, int front, int end) {
        int pivot = input[end];
        int i = front - 1;
        for (int j = front; j < end; j++) {
            if (input[j] < pivot) {
                i++;
                swap(input, i, j);
            }
        }
        i++;
        swap(input, i, end);
        return i;
    }

    public void QuickSortHelper(int[] input, int front, int end) {
        if (front < end) {
            int pivot = partition(input, front, end);
            QuickSortHelper(input, front, pivot - 1);
            QuickSortHelper(input, pivot + 1, end);
        }
    }
    @Override
    public void sort(int[] input) {
        QuickSortHelper(input, 0, input.length - 1);
    }
}
