package com.peakode;

public class BinarySearchTree {

    public Node mRootNode;

    private class Node {
        int mValue;
        Node mLeftNode;
        Node mRightNode;

        private Node(int value) {
            mValue = value;
            mLeftNode = null;
            mRightNode = null;
        }
    }

    public BinarySearchTree(int rootValue) {
        mRootNode = new Node(rootValue);
    }

    public void insert(int newValue) {
        insertHelper(mRootNode, newValue);
    }

    private void insertHelper(Node currentNode, int newValue) {
        if (currentNode.mValue < newValue) {
            // Go right node
            if (currentNode.mRightNode != null) {
                // Recursion
                insertHelper(currentNode.mRightNode, newValue);
            }else{
                currentNode.mRightNode = new Node(newValue);
            }
        } else {
            // Go left node
            if (currentNode.mLeftNode != null){
                // Recursion
                insertHelper(currentNode.mLeftNode, newValue);
            } else{
                currentNode.mLeftNode = new Node(newValue);
            }

        }
    }

    public String preOrderPrintTree(Node startNode, String traversal){
        if (startNode != null){
            traversal += "-" + startNode.mValue;
            // recursion
            traversal = preOrderPrintTree(startNode.mLeftNode, traversal);
            traversal = preOrderPrintTree(startNode.mRightNode, traversal);
        }
        return new StringBuilder(traversal).reverse().toString();
    }

}
