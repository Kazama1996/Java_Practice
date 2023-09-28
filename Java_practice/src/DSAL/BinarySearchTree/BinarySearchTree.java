package BinarySearchTree;

public interface BinarySearchTree {

    void insert(int key, String val);

    TreeNode find(int key);

    void inorder(TreeNode root);
}
