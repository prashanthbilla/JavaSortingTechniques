package com.javasorting;

public class LinearSearch {

    public String linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return key + " found for index number " + i;
            }
        }
        return key + " Key not found for any index";
    }

}
