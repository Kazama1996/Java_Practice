package Launcher.ipml.Algorithm;

import Algorithm.Sorting.Sorting;
import Algorithm.Sorting.Impl.QuickSort;
import Launcher.Launcher;

public class SortingLauncher implements Launcher {

    private Sorting sorting;

    public SortingLauncher() {
        this.sorting = new QuickSort();
    }

    @Override
    public void launch() throws CloneNotSupportedException {
        int[] input = { 4, 1, 3, 2, 5, 9, 8, 6, 7 };
        sorting.sort(input);
        for (int i : input) {
            System.out.print(i + " ");
        }
    }
    
}
