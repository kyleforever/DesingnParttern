package org.kyle.BinaryTree;

/**
 * Created by longli on 20/03/17.
 */
public class BinaryTreeTest {
    public static void main (String[] args) {
        Integer[] testArray =new  Integer[]{43,12,44,8,23};
        BinaryTree binaryTree = new BinaryTree(testArray);
        binaryTree.inorder();
        binaryTree.postorder();
    }
}
