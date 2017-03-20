package org.kyle.BinaryTree;

/**
 * Created by longli on 15/03/17.
 */
public class TreeNode implements Comparable{
    Object element;
    TreeNode left;
    TreeNode right;

    public TreeNode(Object o) {
        element = o;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
