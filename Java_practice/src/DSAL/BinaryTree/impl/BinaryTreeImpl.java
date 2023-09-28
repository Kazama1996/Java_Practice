package BinaryTree.impl;

import java.util.LinkedList;
import java.util.Queue;

import BinaryTree.BinaryTree;
import BinaryTree.TreeNode;

public class BinaryTreeImpl implements BinaryTree {
    public TreeNode root;

    public BinaryTreeImpl(TreeNode root) {
        this.root = root;
    }

    public BinaryTreeImpl() {
    }

    public void Preorder(TreeNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public void Inorder(TreeNode root) {

        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public void Postorder(TreeNode root) {
        if (root == null)
            return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    @Override
    public void Levelorder(TreeNode node) {
        if (node == null)
            return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(node);
        while (!q.isEmpty()) {
            TreeNode current = q.peek();
            System.out.print(current.data + " ");
            q.poll();
            if (current.left != null)
                q.add(current.left);
            if (current.right != null)
                q.add(current.right);

        }
    }

    @Override
    public TreeNode leftMost(TreeNode current) {
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    @Override
    public TreeNode rightMost(TreeNode current) {
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    @Override
    public TreeNode InorderSuccessor(TreeNode current) {
        if (current.right != null) {
            return leftMost(current.right);
        }
        TreeNode successor = current.parent;
        while (successor != null && current == successor.right) {
            current = successor;
            successor = successor.parent;
        }
        return successor;
    }

    @Override
    public TreeNode InorderPredecessor(TreeNode current) {
        if (current.left != null) {
            return rightMost(current.left);
        }
        TreeNode successor = current.parent;
        while (successor != null && current == successor.left) {
            current = successor;
            successor = successor.parent;
        }
        return successor;

    }

    @Override
    public void InorderByParent(TreeNode root) {

        TreeNode current = leftMost(root);

        while (current != null) {
            System.out.print(current.data + " ");
            current = InorderSuccessor(current);
        }

    }

    @Override
    public void InorderReverseByParent(TreeNode root) {
        TreeNode current = rightMost(root);

        while (current != null) {
            System.out.print(current.data + " ");
            current = InorderPredecessor(current);
        }

    }

    @Override
    public TreeNode insert(Integer[] data) {

        if (data[0] == null)
            return null;
        TreeNode root = new TreeNode(data[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (i < data.length) {
            TreeNode current = q.poll();

            if (i < data.length && data[i] != null) {
                TreeNode newNode = new TreeNode(data[i]);
                current.left = newNode;
                newNode.parent = current;
                q.add(current.left);
            }
            i++;

            if (i < data.length && data[i] != null) {
                TreeNode newNode = new TreeNode(data[i]);
                current.right = newNode;
                newNode.parent = current;

                q.add(current.right);
            }
            i++;
        }

        return root;
    }

}
