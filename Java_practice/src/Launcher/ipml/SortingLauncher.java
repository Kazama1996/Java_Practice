package Launcher.ipml;

import Launcher.Launcher;
import Sorting.BubbleSort;
import Sorting.MergeSort;
import Sorting.QuickSort;
import Sorting.Sorting;

public class SortingLauncher implements Launcher {

    private Sorting sorting;

    public SortingLauncher() {
        this.sorting = new QuickSort();
    }

    @Override
    public void launch() {
        // TODO Auto-generated method stub

        int[] input = { 4, 1, 3, 2, 5, 9, 8, 6, 7 };
        sorting.sort(input);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

}
