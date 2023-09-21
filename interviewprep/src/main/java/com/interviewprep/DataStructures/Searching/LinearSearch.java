package com.interviewprep.DataStructures.Searching;

public class LinearSearch {

    public static void main(String[] args){
        int[] arr = {10,5,3,7,8,34,54,23,12};
        int key = 34;
        linearSearch(arr,key);
    }

    public static void linearSearch(int[] arr, int key){
        boolean found = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                found = true;
                System.out.println("Key found in position :" + i);
            }
        }
        if(!found){
            System.out.println("Key not found");
        }
    }
}
