package com.javasorting;

public class Main {

    public static void main(String[] args) {
        int[] array = {34, 89, 12, 45, 67, 23, 74, 10, 50, 99};
        int key = 23;
        int length=array.length-1;
        LinearSearch search = new LinearSearch();
        System.out.println(search.linearSearch(array, key));
        BinarySearch binarySearch=new BinarySearch();
        binarySearch.binarySearch1(array,0,length,key);
    }
}
