/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructs;

/**
 *
 * @author Luis
 */

public class BinarySearchTree {
    private BSTNode root;


    public BinarySearchTree()
    {
        root = new BSTNode<>(null);
    }

    public void insertRec(T value)
    {
        BSTNode<T> newNode = new BSTNode<>(value);
        if (root == null)
        {
            root = newNode;
        } else {
            insertNode(newNode);
        }
    }

    public void insertNode(BSTNode<T> currNode)
    {
        if (root.left != null && root.right != null)
        {
            if (currNode.getValue() > root.getValue())
            {
                
            }
        }
    }

    private class BSTNode<T>
    {
        private T value;
        private BSTNode<T> left;
        private BSTNode<T> right;

        public BSTNode(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public T getValue()
        {
            return value;
        }

        public void setValue(T value)
        {
            this.value = value;
        }

        public BSTNode<T> getLeft()
        {
            return left;
        }

        public void setLeft(BSTNode<T> left)
        {
            this.left = left;
        }

        public BSTNode<T> getRight()
        {
            return right;
        }

        public void setRight(BSTNode<T> right)
        {
            this.right = right;
        }
    }



}
