package com.Binary_Tree;

public class Main {
    public static void main(String[] args) {
        NodeBinary root = new NodeBinary(10, null, null);
        BinaryTree bt = new BinaryTree(root);
        bt.addNode(new NodeBinary(33, null, null), bt.root);
        bt.addNode(new NodeBinary(1, null, null), bt.root);
        bt.addNode(new NodeBinary(3, null, null), bt.root);
        bt.addNode(new NodeBinary(5, null, null), bt.root);
        bt.addNode(new NodeBinary(8, null, null), bt.root);


        bt.searchItem(10, bt.root);

    }
}
