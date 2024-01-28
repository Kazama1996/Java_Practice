package Launcher.ipml.DataStructure;

import DataStructure.BinarySearchTree.TreeNode;
import DataStructure.BinarySearchTree.Impl.BinarySearchTree;
import Launcher.Launcher;

public class BinarySearchTreeLauncher implements Launcher {

    BinarySearchTree binarySearchTree;

    public BinarySearchTreeLauncher() {
        this.binarySearchTree = new BinarySearchTree();
    }

    @Override
    public void launch() throws CloneNotSupportedException {

        binarySearchTree.insert(513, "A");
        binarySearchTree.insert(8, "B");
        binarySearchTree.insert(524, "C");
        binarySearchTree.insert(79, "D");
        binarySearchTree.insert(43, "E");
        binarySearchTree.insert(514, "F");
        binarySearchTree.insert(709, "G");
        binarySearchTree.insert(627, "H");
        binarySearchTree.insert(1000, "I");

        TreeNode find = binarySearchTree.find(79);

        binarySearchTree.inorder();

        // binarySearchTree.delete(627);

        System.out.println();
        binarySearchTree.delete(709);
        binarySearchTree.delete(43);
        binarySearchTree.delete(8);
        binarySearchTree.inorder();

    }

}
