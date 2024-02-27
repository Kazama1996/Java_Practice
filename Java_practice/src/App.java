import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import javax.management.RuntimeErrorException;

import Algorithm.Sorting.Impl.QuickSort;
import DesignPattern.Proxy.DynamicProxy.ProxyFactory;
import DesignPattern.Proxy.DynamicProxy.RealClass1;
import DesignPattern.Proxy.DynamicProxy.RealClass2;
import DesignPattern.Proxy.DynamicProxy.RealInterface;
import DesignPattern.Proxy.DynamicProxy.RealInterface2;
import DesignPattern.Singleton.SingletonLazyThreadSafe;
import DesignPattern.Singleton.SingletonPublic;
import DesignPattern.Singleton.SingletonStaticFactoryEager;
import DesignPattern.Singleton.SingletonStaticFactoryLazy;
import DesignPattern.Singleton.SingletonTest;
import JAVA_Language.Thread.CreateThread.EvenRunnable;
import JAVA_Language.interfaceAndAbstractclass.MyInterface1;
import JAVA_Language.interfaceAndAbstractclass.TestClass;
import Launcher.Launcher;
import Launcher.Test;
import Launcher.ipml.Java_LanguageLauncher;
import Launcher.ipml.Algorithm.DynamicProgrammingLauncher;
import Launcher.ipml.DataStructure.BinarySearchTreeLauncher;
import Launcher.ipml.DataStructure.RedBlackTreeLauncher;
import Launcher.ipml.DesignPattern.FlyWeightLauncher;
import Launcher.ipml.DesignPattern.ProxyLauncher;

public class App {

    // public static int[][] pascal(int rowNum) {

    // int[][] triangle = new int[rowNum][];

    // for (int i = 0; i < rowNum; i++) {
    // triangle[i] = new int[i + 1];

    // for (int j = 0; j < triangle[i].length; j++) {
    // triangle[i][j] = calcTriangleElement(i, j);
    // }
    // }
    // return triangle;
    // }

    // static int calcTriangleElement(int row, int col) {
    // return (col == 0 || col == row) ? 1 : calcTriangleElement(row - 1, col - 1) +
    // calcTriangleElement(row - 1, col);
    // }

    public static void mergee(int[] array, int front, int mid, int end) {
        int[] lsub = Arrays.copyOfRange(array, front, mid + 1);
        int[] rsub = Arrays.copyOfRange(array, mid + 1, end + 1);
        int Lidx = 0;
        int Ridx = 0;
        int k = front;
        while (Lidx < lsub.length && Ridx < rsub.length) {
            if (lsub[Lidx] < rsub[Ridx]) {
                array[k] = lsub[Lidx];
                Lidx++;
            } else {
                array[k] = rsub[Ridx];
                Ridx++;
            }
            k++;
        }

        while (Lidx < lsub.length) {
            array[k] = lsub[Lidx];
            Lidx++;
            k++;
        }

        while (Ridx < rsub.length) {
            array[k] = rsub[Ridx];
            Ridx++;
            k++;
        }

    }

    // public static void mergeSort(int[] array, int front, int end) {
    // if (front < end) {
    // int mid = front + (end - front) / 2;
    // mergeSort(array, front, mid);
    // mergeSort(array, mid + 1, end);
    // merge(array, front, mid, end);
    // }
    // }

    // private static void swap(int[] arr, int i, int j) {
    // int temp = arr[i];
    // arr[i] = arr[j];
    // arr[j] = temp;
    // }

    // public static int findPivot(int[] array, int front, int end) {
    // int i = front - 1;
    // int pivot = array[end];
    // for (int j = front; j < end; j++) {
    // if (array[j] > pivot) {
    // i++;
    // swap(array, i, j);
    // }
    // }
    // swap(array, i + 1, end);

    // return i + 1;
    // }

    // public static void quickSort(int[] array, int front, int end) {
    // if (front < end) {
    // int pivot = findPivot(array, front, end);
    // quickSort(array, front, pivot - 1);
    // quickSort(array, pivot, end);
    // }
    // }

    public static void merge(int[] array, int front, int mid, int end) {
        int[] lSub = Arrays.copyOfRange(array, front, mid + 1);
        int[] rSub = Arrays.copyOfRange(array, mid + 1, end + 1);
        int lIdx = 0;
        int rIdx = 0;
        int i = front;

        while (lIdx < lSub.length && rIdx < rSub.length) {
            if (lSub[lIdx] < rSub[rIdx]) {
                array[i] = lSub[lIdx];
                lIdx++;
            } else {
                array[i] = rSub[rIdx];
                rIdx++;
            }
            i++;
        }

        while (lIdx < lSub.length) {
            array[i] = lSub[lIdx];
            i++;
            lIdx++;
        }

        while (rIdx < rSub.length) {
            array[i] = rSub[rIdx];
            i++;
            rIdx++;
        }

    }

    public static void mergeSort(int[] array, int front, int end) {
        if (front < end) {
            int mid = front + (end - front) / 2;
            mergeSort(array, front, mid);
            mergeSort(array, mid + 1, end);
            merge(array, front, mid, end);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int findPivot(int[] array, int front, int end) {
        int pivot = array[end];
        int i = front - 1;

        for (int j = front; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, end);
        return i + 1;
    }

    /*
     * @Description Quick Sort Implementation
     * 
     * @Author Adam
     * 
     * @date 2024/02/07
     * 
     * @param array int array any Integer array
     * 
     * @param front int the first index of the array
     * 
     * @param end int the last index of the array
     * 
     * @exception Exception
     */
    public static void quickSort(int[] array, int front, int end) throws Exception {
        if (front < end) {
            int pivotId = findPivot(array, front, end);
            quickSort(array, front, pivotId - 1);
            quickSort(array, pivotId + 1, end);
        }
    }

    {
        System.out.println("c");
    }

    static {
        System.out.println("b");
    }

    {
        System.out.println("a");
    }

    public App() {
        System.out.println("d");
    }

    public static void main(String[] args) {

        App app = new App();

        // int[] a = new int[] { 5, 7, 3, 4, 1, 8, 9, 6, 2, 10 };

        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[i] > a[j]) {
        // swap(a, i, j);
        // }
        // }
        // }

        // // for (int i = 0; i < a.length; i++) {
        // // for (int j = i; j < a.length; j++) {
        // // if (a[i] > a[j]) {
        // // int temp = a[i];
        // // a[i] = a[j];
        // // a[j] = temp;
        // // }
        // // }
        // // }

        // int c = 2, b = 3;

        // Arrays.stream(a).forEach(System.out::println);
    }
}
