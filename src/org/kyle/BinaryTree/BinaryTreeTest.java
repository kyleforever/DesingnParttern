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

        BinaryTree binaryTree1 = new BinaryTree();
        binaryTree1.insert("George");
        binaryTree1.insert("Michael");
        binaryTree1.insert("Tom");
        binaryTree1.insert("Adam");
        binaryTree1.insert("Jones");
        binaryTree1.inorder();
        binaryTree1.postorder();
    }
}
