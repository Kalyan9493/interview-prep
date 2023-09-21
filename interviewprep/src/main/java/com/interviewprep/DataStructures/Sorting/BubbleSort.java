package com.interviewprep.DataStructures.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {5,6,3,1,15,45,32,23};
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        arr = bubbleSort(arr);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }

    public static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[i] < arr[j]){
                   arr[i] = arr[i]+arr[j] - (arr[j] = arr[i]);
                }
            }
        }
        return arr;
    }
}