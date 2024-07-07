package Vis.Concepts.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4,-1,-99,5,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i = 0;i < arr.length;i++){
            int max = 0;
            for(int j = 0; j < arr.length-i;j++){
                if(arr[j]>arr[max]){
                    max = j;
                }
            }
            swap(arr,max,arr.length-i-1);
        }
    }

    private static void swap(int[] arr, int j, int k){
        int t =  arr[j];
        arr[j] = arr[k];
        arr[k] = t;
    }
}
