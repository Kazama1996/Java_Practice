package DataStructure.BinarySearchTree.Impl;

import DataStructure.BinarySearchTree.BinarySearchTree;
import DataStructure.BinarySearchTree.TreeNode;

public class BinarySearchTreeImpl implements BinarySearchTree {

    public TreeNode root;

    public BinarySearchTreeImpl() {
        this.root = null;
    }

    @Override
    public void insert(int key, String val) {
        if (this.root == null) {
            this.root = new TreeNode(key, val);
            return;
        }
        TreeNode target = null, current = this.root;

        while (current != null) {
            if (key < current.key) {
                target = current;
                current = current.left;
            } else if (key > current.key) {
                target = current;
                current = current.right;
            }
        }
        TreeNode newNode = new TreeNode(key, val);
        if (key > target.key) {
            target.right = newNode;
        }

        if (key < target.key) {
            target.left = newNode;
        }
        return;
    }

    @Override
    public TreeNode find(int key) {
        if (this.root == null)
            return null;
        TreeNode current = root;
        while (current != null) {
            if (current.key.equals(key)) {
                return current;
            } else if (key > current.key) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return null;
    }

    @Override
    public void inorder(TreeNode root) {
        if (root == null)
        return;

    inorder(root.left);
    System.out.print(root.key + " ");
    inorder(root.right);
    }
    
}
