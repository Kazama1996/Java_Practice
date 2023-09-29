package DataStructure.BinaryTree;

public class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public Integer data;

    public TreeNode() {
    };

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }
}
