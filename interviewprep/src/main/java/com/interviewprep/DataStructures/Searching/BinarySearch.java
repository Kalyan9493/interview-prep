package com.interviewprep.DataStructures.Searching;

public class BinarySearch {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 11;
        int result = binarySearch(arr, key, 0, arr.length);
        if(result == -1){
            System.out.println("Key not found");
        }
    }

    public static int binarySearch(int[] arr, int key, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                System.out.println("Key found at position : " + mid);
                return mid;
            }
            if(arr[mid] > key){
                return binarySearch(arr,key,mid+1, high);
            }
            if(arr[mid] < key){
                return binarySearch(arr,key,low,mid-1);
            }
        }
        return -1;
    }
}
