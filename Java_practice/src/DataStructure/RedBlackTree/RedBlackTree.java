package DataStructure.RedBlackTree;

import javax.swing.text.html.HTMLDocument.HTMLReader.BlockAction;

public class RedBlackTree {

    public TreeNode root;
    public TreeNode neel;

    public RedBlackTree() {
        this.neel = new TreeNode(-1, "NIL");
        neel.color = true;
        root = neel;
        root.parent = neel;

    }

    public void leftRotation(TreeNode x) {
        TreeNode y = x.right;

        x.right = y.left;

        if (y.left != neel) {
            y.left.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == neel) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;

    }

    public void rightRotation(TreeNode x) {
        TreeNode y = x.left;
        x.left = y.right;
        if (y.right != neel) {
            y.right.parent = x;
        }
        y.parent = x.parent;
        if (x.parent == neel) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.right = x;
        x.parent = y;
    }

    public void insert(int key, String str) {
        TreeNode y = neel;
        TreeNode x = root;
        TreeNode newNode = new TreeNode(key, str);

        while (x != neel) {
            y = x;
            if (newNode.key < x.key) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        newNode.parent = y;
        if (y == neel) {
            this.root = newNode;
        } else if (newNode.key < y.key) {
            y.left = newNode;
        } else {
            y.right = newNode;
        }
        newNode.left = neel;
        newNode.right = neel;
        newNode.color = false;
        fixUPInsertion(newNode);

    }

    public void fixUPInsertion(TreeNode current) {
        while (current.parent.color == false) {
            if (current.parent == current.parent.parent.left) {
                TreeNode uncle = current.parent.parent.right;
                // case 1
                if (uncle.color == false) {
                    current.parent.color = true;
                    uncle.color = true;
                    current.parent.parent.color = false;
                    current = current.parent.parent;
                } else {
                    if (current == current.parent.right) {
                        current = current.parent;
                        leftRotation(current);
                    }
                    current.parent.color = true;
                    current.parent.parent.color = false;
                    rightRotation(current.parent.parent);
                }
            } else {
                TreeNode uncle = current.parent.parent.left;
                if (uncle.color == false) {
                    current.parent.color = true;
                    uncle.color = true;
                    current.parent.parent.color = false;
                    current = current.parent.parent;
                } else {
                    if (current == current.parent.left) {

                        current = current.parent;
                        rightRotation(current);
                    }

                    current.parent.color = true;
                    current.parent.parent.color = false;
                    leftRotation(current.parent.parent);
                }
            }
        }
        this.root.color = true;
    }

    public void inorder(TreeNode current) {
        if (current == null)
            return;

        inorder(current.left);
        System.out.println(current.key);
        inorder(current.right);
        return;
    }

    public void preorder(TreeNode current) {
        if (current == null)
            return;

        System.out.println(current.key);
        preorder(current.left);
        preorder(current.right);
        return;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
