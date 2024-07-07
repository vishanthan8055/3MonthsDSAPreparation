package Vis.Concepts.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,1,4,3,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        boolean isSwap = false;
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j + 1 < arr.length-i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    isSwap = true;
                }
            }
            if(!isSwap){
                break;
            }
        }
    }
    private static void swap(int[] arr, int j, int k){
        int t =  arr[j];
        arr[j] = arr[k];
        arr[k] = t;
    }
}
