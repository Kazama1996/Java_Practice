package BinaryHeap;

public interface BinaryHeap {
    void insert(int key, String val);

    HeapNode extractMax();
}
