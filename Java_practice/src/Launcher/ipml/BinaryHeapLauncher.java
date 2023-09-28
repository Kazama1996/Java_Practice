package Launcher.ipml;

import BinaryHeap.BinaryHeap;
import BinaryHeap.ipml.BinaryHeapIpml;
import Launcher.Launcher;

public class BinaryHeapLauncher implements Launcher {

    @Override
    public void launch() {
        BinaryHeap heap = new BinaryHeapIpml();
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
