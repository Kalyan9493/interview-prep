package com.interviewprep.DataStructures.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5,6,3,1,15,45,32,23,1};
        System.out.println("Array before sorting : " + Arrays.toString(arr));
        arr = selectionSort(arr);
        System.out.println("Array after sorting : " + Arrays.toString(arr));
    }

    public static int[] selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min_idx = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min_idx])
                    min_idx = j;
            }
            arr[i] = arr[i] + arr[min_idx] - (arr[min_idx] = arr[i]);
        }
        return arr;
    }
}
