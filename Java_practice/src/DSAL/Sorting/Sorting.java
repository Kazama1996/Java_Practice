package Sorting;

public abstract class Sorting {
    public void sort(int[] input) {
    }

    protected void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
