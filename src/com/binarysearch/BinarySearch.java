package com.binarysearch;

public class BinarySearch {
    public int binarysearch(int arr[],int x)
    {
        int l=0,h=arr.length-1;
        while(l<=h)
        {
             int m=l+(h-l)/2;
             if(x == arr[m])
                return m;
             else if (x>arr[m])
                 l=m+1;
             else
                 h=m-1;
        }
        return -1;
    }
 }
