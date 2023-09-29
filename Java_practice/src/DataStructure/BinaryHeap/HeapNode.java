package DataStructure.BinaryHeap;

public class HeapNode {
    public String val;
    public int key;

    public HeapNode(int key, String val) {
        this.key = key;
        this.val = val;
    }

    public String getVal() {
        return this.val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

}
