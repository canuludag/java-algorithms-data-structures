package com.peakode;

import com.sun.istack.internal.Nullable;

public class CustomLinkedList {

    public Element mHeadElement;

    public static class Element {
        public Element mNextElement;
        public int mValue;

        public Element(int value) {
            mValue = value;
            mNextElement = null;
        }
    }

    public CustomLinkedList(@Nullable Element headElement) {
        mHeadElement = headElement;
    }

    public void append(Element newElement) {
        Element current = mHeadElement;
        if (mHeadElement != null) {
            // First element is not null
            while (current.mNextElement != null) {
                current = current.mNextElement;
            }
            current.mNextElement = newElement;
        } else {
            // First element is null
            mHeadElement = newElement;
        }
    }

    public Element getPosition(int position) {
        // Assume first position is 0
        int indexCounter = 0;
        Element currentElement = mHeadElement;
        if (mHeadElement != null) {
            while (indexCounter <= position) {
                if (indexCounter == position) {
                    return currentElement;
                } else {
                    indexCounter++;
                    currentElement = currentElement.mNextElement;
                }
            }
        } else {
            return null;
        }
        return currentElement;
    }

    public void deleteElement(int value) {
        Element currentElement = mHeadElement;
        if (currentElement.mValue == value) {
            mHeadElement = currentElement.mNextElement;
        } else {
            while (currentElement.mNextElement != null) {
                Element tempElement = currentElement.mNextElement;
                if (tempElement.mValue == value) {
                    currentElement.mNextElement = tempElement.mNextElement;
                }else{
                    currentElement = currentElement.mNextElement;
                }
            }
        }
    }

    public int size() {
        int indexCounter = 0;
        Element currentElement = mHeadElement;
        if (mHeadElement != null) {
            indexCounter++;
            while (currentElement.mNextElement != null) {
                indexCounter++;
                currentElement = currentElement.mNextElement;
            }
            return indexCounter;
        }
        return indexCounter;
    }


}
