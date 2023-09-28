package BinaryHeap.ipml;

import java.util.ArrayList;
import java.util.List;

import BinaryHeap.BinaryHeap;
import BinaryHeap.HeapNode;

public class BinaryHeapIpml implements BinaryHeap {

    private List<HeapNode> heap;

    public BinaryHeapIpml() {
        heap = new ArrayList<>();
    }

    private void swap(int i, int j) {
        HeapNode temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    private void maxHeapify(int index) {
        int left = (2 * index) + 1;
        int right = (2 * index) + 2;
        int largest = index;
        if (left < heap.size() && heap.get(left).getKey() > heap.get(largest).getKey()) {
            largest = left;
        }
        if (right < heap.size() && heap.get(right).getKey() > heap.get(largest).getKey()) {
            largest = right;
        }
        if (index != largest) {
            swap(index, largest);
            maxHeapify(largest);
        }

    }

    @Override
    public void insert(int key, String val) {
        HeapNode newNode = new HeapNode(key, val);
        heap.add(newNode);
        int currentIndex = heap.size() - 1;
        int parentIndex = (currentIndex - 1) / 2;
        while (currentIndex > 0 && heap.get(currentIndex).getKey() > heap.get(parentIndex).getKey()) {
            swap(currentIndex, parentIndex);
            currentIndex = parentIndex;
            parentIndex = (currentIndex - 1) / 2;
        }

    }

    @Override
    public HeapNode extractMax() {
        HeapNode maxNode = heap.get(0);
        int lastIndex = heap.size() - 1;
        heap.set(0, heap.get(lastIndex));
        heap.remove(lastIndex);
        maxHeapify(0);
        return maxNode;
    }

}
