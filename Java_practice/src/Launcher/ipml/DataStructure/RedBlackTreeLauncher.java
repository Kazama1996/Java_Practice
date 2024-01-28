package Launcher.ipml.DataStructure;

import DataStructure.RedBlackTree.RedBlackTree;
import Launcher.Launcher;

public class RedBlackTreeLauncher implements Launcher {

    @Override
    public void launch() throws CloneNotSupportedException {
        // TODO Auto-generated method stub

        RedBlackTree tree = new RedBlackTree();

        tree.insert(1, "A");
        tree.insert(2, "B");
        tree.insert(3, "C");
        tree.insert(4, "D");
        tree.insert(5, "E");
        tree.insert(6, "F");
        tree.insert(7, "G");

        System.out.println(tree.maxDepth(tree.root));

    }

}
