package DataStructure.RedBlackTree;

public class TreeNode {
    public TreeNode(int key, String str) {

        this.key = key;
        this.element = str;
    }

    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public int key;
    public String element;
    public boolean color; // 0: red, 1:black

}
