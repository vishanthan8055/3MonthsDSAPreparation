package Vis.Concepts.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4,-1,-99,5,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int k){
        int t =  arr[j];
        arr[j] = arr[k];
        arr[k] = t;
    }
}
