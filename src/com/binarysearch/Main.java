package com.binarysearch;

public class Main {
    public static void main(String[] args) {

        BinarySearch obj1=new BinarySearch();
        int arr[]={ 2, 3, 4, 10, 40 };
        int x=3;
        int n=obj1.binarysearch(arr,x);
        if (n == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + n);
    }
}
