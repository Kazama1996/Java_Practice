package Launcher.ipml.DataStructure;

import DataStructure.BinaryTree.TreeNode;
import DataStructure.BinaryTree.Impl.BinaryTreeImpl;
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

        tree.InorderReverseByParent(root);

        System.out.println();

    }
    
}
