package Algorithm.Sorting.Impl;

import java.util.Arrays;

import Algorithm.Sorting.Sorting;

public class MergeSort extends Sorting{
     private void merge(int[] input, int[] left_sub, int[] right_sub) {
        int leftLength = left_sub.length;
        int rightLength = right_sub.length;
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left_sub[i] > right_sub[j]) {
                input[k++] = left_sub[i++];
            } else {
                input[k++] = right_sub[j++];
            }
        }
        while (i < leftLength) {
            input[k++] = left_sub[i++];
        }
        while (j < rightLength) {
            input[k++] = right_sub[j++];
        }
    
    }

    @Override
    public void sort(int[] input) {
        if (input == null || input.length <= 1)
            return;

        int mid = input.length / 2;
        int[] L = Arrays.copyOfRange(input, 0, mid);
        int[] R = Arrays.copyOfRange(input, mid, input.length);
        sort(L);
        sort(R);
        merge(input, L, R);

    }
}
