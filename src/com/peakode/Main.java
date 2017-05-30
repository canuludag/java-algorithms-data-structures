package com.peakode;

public class Main {

    public static void main(String[] args) {
        int[] testArray = {1, 3, 9, 11, 15, 19, 29};
        int searchValue1 = 1;
        int searchValue2 = 19;


        int index = LinearSearch.searchIntArray(testArray, searchValue1);
        System.out.println(index + "");
        index = LinearSearch.searchIntArray(testArray, searchValue2);
        System.out.println(index + "");

        int index2 = BinarySearch.searchIntArray(testArray, searchValue1);
        System.out.println(index2 + "");
        index2 = BinarySearch.searchIntArray(testArray, searchValue2);
        System.out.println(index2 + "");

        // Binary Search Tree
        BinarySearchTree bst = new BinarySearchTree(4);
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.insert(5);

        String printedTree = bst.preOrderPrintTree(bst.mRootNode, "");
        System.out.println(printedTree);

        // LinkedList
        CustomLinkedList.Element element1 = new CustomLinkedList.Element(1);
        CustomLinkedList.Element element2 = new CustomLinkedList.Element(2);
        CustomLinkedList.Element element3 = new CustomLinkedList.Element(3);
        CustomLinkedList.Element element4 = new CustomLinkedList.Element(4);

        CustomLinkedList customLinkedList = new CustomLinkedList(element1);
        customLinkedList.append(element2);
        customLinkedList.append(element3);
        customLinkedList.append(element4);

        // Should print 2
        System.out.println(customLinkedList.mHeadElement.mNextElement.mValue + "");
        // Should also print 2
        System.out.println(customLinkedList.getPosition(2).mValue + "");
        System.out.println("LinkedList size: " + customLinkedList.size() + "");

        customLinkedList.deleteElement(2);
        System.out.println("LinkedList size: " + customLinkedList.size() + "");


        // Stacks
        System.out.println("\n----STACKS----");

        CustomStack cs = new CustomStack(null);

        for (int i = 0; i < 15; i++) {
            CustomStack.Element element = new CustomStack.Element((int)(Math.pow(i, 2) + 3));
            cs.push(element);
        }

        System.out.println(cs.mCustomLinkedList.size() + "");
        // Should print 199
        System.out.println(cs.pop().mValue + "");


    }
}
