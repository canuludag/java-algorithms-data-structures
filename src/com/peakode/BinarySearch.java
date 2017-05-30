package com.peakode;

public class BinarySearch {

    public static int searchIntArray(int[] inputArray, int searchValue) {
        int low = 0;
        int high = inputArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (inputArray[mid] == searchValue) {
                return mid;
            } else if (inputArray[mid] < searchValue) {
                // Go right
                low = mid + 1;
            } else {
                // Go left
                high = mid - 1;
            }
        }

        return -1;
    }

}
