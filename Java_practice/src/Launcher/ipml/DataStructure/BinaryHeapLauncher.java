package Launcher.ipml.DataStructure;

import DataStructure.BinaryHeap.BinaryHeap;
import DataStructure.BinaryHeap.Impl.BinaryHeapImpl;
import Launcher.Launcher;

public class BinaryHeapLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {
        BinaryHeap heap = new BinaryHeapImpl();
        heap.insert(1, "A");
        heap.insert(2, "B");
        heap.insert(3, "C");
        heap.insert(4, "D");
        heap.insert(5, "E");
        heap.insert(6, "F");

        System.out.println(heap.extractMax().getVal());
        System.out.println(heap.extractMax().getVal());
        System.out.println(heap.extractMax().getVal());
        System.out.println(heap.extractMax().getVal());
        System.out.println(heap.extractMax().getVal());
        System.out.println(heap.extractMax().getVal());
    }
    
}
