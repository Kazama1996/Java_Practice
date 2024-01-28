package DataStructure.BinarySearchTree.Impl;

import DataStructure.BinarySearchTree.TreeNode;

public class BinarySearchTree {

    public TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int key, String val) {
        TreeNode y = null; // 準新手爸媽
        TreeNode x = null; // 哨兵
        TreeNode insert_node = new TreeNode(key, val); // insert_node為將要新增的node

        x = root;
        while (x != null) {
            y = x;
            if (insert_node.key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        insert_node.parent = y;

        if (y == null) {
            this.root = insert_node;
        } else if (insert_node.key < y.key) {
            y.left = insert_node;
        } else {
            y.right = insert_node;
        }
    }

    public TreeNode find(int key) {
        if (this.root == null)
            return null;
        TreeNode current = this.root;
        while (current != null && current.key != key) {
            if (key < current.key) {
                current = current.left; // 向左走
            } else {
                current = current.right; // 向右走
            }
        }
        return current;
    }

    public void inorder() {
        inorder(this.root);
    }

    private void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }

    public void delete(int key) {
        TreeNode deleteNode = find(key);

        if (deleteNode == null) {
            System.out.println("BST Delete Node : Could not find the node :" + key);
            return;
        }

        TreeNode y;
        TreeNode x;

        if (deleteNode.left == null || deleteNode.right == null) {
            y = deleteNode;
        } else {
            y = successor(deleteNode);
        }

        if (y.left != null) {
            x = y.left;
        } else {
            x = y.right;
        }

        if (x != null) {
            x.parent = y.parent;
        }

        if (y.parent == null) {
            this.root = x;
        } else if (y == y.parent.left) {
            y.parent.left = x;
        } else {
            y.parent.right = x;
        }

        if (y != deleteNode) {
            deleteNode.key = y.key;
            deleteNode.val = y.val;
        }
        y = null;
        return;
    }

    private TreeNode successor(TreeNode current) {
        if (current.right != null) {
            return leftMost(current.right);
        }

        TreeNode newNode = current.parent;
        while (current != null && current == newNode.right) {
            current = newNode;
            newNode = newNode.parent;
        }
        return newNode;
    }

    private TreeNode leftMost(TreeNode current) {

        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

}
