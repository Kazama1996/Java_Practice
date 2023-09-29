package Launcher.ipml.DataStructure;

import DataStructure.BinarySearchTree.TreeNode;
import DataStructure.BinarySearchTree.Impl.BinarySearchTreeImpl;
import Launcher.Launcher;

public class BinarySearchTreeLauncher implements Launcher {

     BinarySearchTreeImpl binarySearchTree;

    public BinarySearchTreeLauncher() {
        this.binarySearchTree = new BinarySearchTreeImpl();
    }

    @Override
    public void launch() throws CloneNotSupportedException {
        binarySearchTree.insert(513, "A");

        binarySearchTree.insert(8, "B");
        binarySearchTree.insert(524, "C");
        binarySearchTree.insert(79, "D");
        binarySearchTree.insert(514, "E");
        binarySearchTree.insert(709, "F");
        binarySearchTree.insert(43, "G");
        binarySearchTree.insert(627, "H");
        binarySearchTree.insert(1000, "I");

        TreeNode root = binarySearchTree.root;

        // binarySearchTree.inorder(root);
        TreeNode res = binarySearchTree.find(1000);
        if (res == null) {
            System.out.println("Not found");
        } else {
            System.out.println(res.val);
        }
        binarySearchTree.inorder(root);


    }
    
}
