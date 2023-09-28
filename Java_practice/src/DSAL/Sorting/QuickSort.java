package Sorting;

public class QuickSort extends Sorting {

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

    public void QuickSort(int[] input, int front, int end) {
        if (front < end) {
            int pivot = partition(input, front, end);
            QuickSort(input, front, pivot - 1);
            QuickSort(input, pivot + 1, end);
        }
    }

    public void sort(int[] input) {
        QuickSort(input, 0, input.length - 1);
    }
}
