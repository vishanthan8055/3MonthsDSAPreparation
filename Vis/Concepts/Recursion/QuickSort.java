package Vis.Concepts.Recursion;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6,5,7,8,4,9,0,2,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int l, int h){
        if(l>=h){
            return;
        }
        int position = insertPosition(arr,l,h);
        quickSort(arr,l,position-1);
        quickSort(arr,position+1,h);
    }

    private static int insertPosition(int[] arr, int l, int h) {
        int i = l;
        int j = h;
        int pivot = arr[l];
        while(i<j){
            while(arr[i]<=pivot && i<=h-1){
                i++;
            }
            while(arr[j]>pivot && i>=l+1){
                j--;
            }
            if(i<j){
                swap(arr,i,j);//swap greater to greater part and lower to lower part
            }
        }
        swap(arr,l,j); //swap with pivot
        return j;
    }
    private static void swap(int[] arr, int j, int k){
        int t =  arr[j];
        arr[j] = arr[k];
        arr[k] = t;
    }
}
