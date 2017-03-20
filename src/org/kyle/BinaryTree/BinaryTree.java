package org.kyle.BinaryTree;

/**
 * Created by longli on 15/03/17.
 */
public class BinaryTree {
    private TreeNode root;
    private int size = 0;

    public BinaryTree() {
    }

    public BinaryTree(Object[] objects) {
        for (Object object : objects) {
            insert(object);
        }
    }

    public boolean insert(Object o) {
        if (root == null)
            root = new TreeNode(o);
        else {
            TreeNode parent = null;
            TreeNode current = root;
            while (current != null) {
                if (((Comparable)o).compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                }
                else if (((Comparable)o).compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                }
                else
                    return false;
            }
            if (((Comparable)o).compareTo(parent.element) < 0) {
                parent.left = new TreeNode(o);
            }else{
                parent.right = new TreeNode(o);
            }
        }

        size++;
        return true;
    }

    public void inorder() {
        insert(root);
    }

    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.element + " ");
    }
}
