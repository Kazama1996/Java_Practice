package Launcher.ipml;

import BinaryTree.TreeNode;
import BinaryTree.impl.BinaryTreeImpl;
import Launcher.Launcher;

public class BinaryTreeLauncher implements Launcher {

    private BinaryTreeImpl tree;

    public BinaryTreeLauncher() {
        this.tree = new BinaryTreeImpl();
    }

    @Override
    public void launch() {

        Integer[] data = new Integer[] { 513, 8, 524, null, 79, 514, 709, 43, null, null, null, 627, 1000 };
        TreeNode root = tree.insert(data);

        tree.Inorder(root);

    }

}
