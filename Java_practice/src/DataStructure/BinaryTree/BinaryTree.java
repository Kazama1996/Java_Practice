package DataStructure.BinaryTree;

public interface BinaryTree {
    void Preorder(TreeNode current);

    void Inorder(TreeNode current);

    void InorderByParent(TreeNode root);

    void InorderReverseByParent(TreeNode root);

    void Postorder(TreeNode current);

    void Levelorder(TreeNode current);

    TreeNode leftMost(TreeNode current);

    TreeNode rightMost(TreeNode current);

    TreeNode InorderSuccessor(TreeNode current);

    TreeNode InorderPredecessor(TreeNode current);

    TreeNode insert(Integer[] data);
}
