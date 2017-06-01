package com.peakode;

public class LinearSearch2 {
    public static int searchIntArray(int[] inputArray, int searchValue) {

        int index = 0;
        boolean valFound = false;

        while (!valFound) {
            System.out.println("Loop step: " + index);
            if (inputArray[index] == searchValue) {
                valFound = true;
            } else {
                if (index == inputArray.length - 1) {
                    index = -1;
                    valFound = true;
                } else {
                    index++;
                }
            }

        }

        return index;
    }
}
