package com.peakode;

public class LinearSearch {

    public static int searchIntArray(int[] inputArray, int searchValue) {

        int index = 0;

        while (index < inputArray.length && inputArray[index] < searchValue) {
            System.out.println("Loop step: " + index);
            index++;
        }
        if (index >= inputArray.length || inputArray[index] != searchValue) return -1;

        return index;
    }

}
