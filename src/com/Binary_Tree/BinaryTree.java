package com.Binary_Tree;

public class BinaryTree {
    NodeBinary root;

    public BinaryTree(NodeBinary root) {
        this.root = root;
    }

    public void addNode(NodeBinary newNode, NodeBinary r) {
        if (r == null) {
            System.out.println("Value is not added");
            return;
        }
        if (newNode.value > r.value) {
            if (r.right == null)
                r.right = newNode;
            else
                addNode(newNode, r.right);
        }
        if (newNode.value < r.value) {
            if (r.left == null)
                r.left = newNode;
            else
                addNode(newNode, r.left);
        }
    }

    public void searchItem(int value, NodeBinary root) {
        if (root == null) {
            System.out.println("Value is cannot founded");
            return;
        }
        if (value == root.value) {
            System.out.println("Value is can founded");
            return;
        }
        if (value > root.value)
            searchItem(value, root.right);
        if (value < root.value)
            searchItem(value, root.left);


    }




}
