package Vis.Concepts.Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,5,7,3,2,7,9,3,6};
        mergeSort(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int s, int e, int[] arr){
        if(s >= e){
            return;
        }
        int m = s + ((e-s)/2);
        mergeSort(s,m,arr);
        mergeSort(m+1,e,arr);
        merge(arr,s,m,e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] temp = new int[e+1];
        int i = 0;
        int l = s;
        int r = m+1;
        while(l<=m && r<=e){
            if(arr[l]<=arr[r]){
                temp[i] = arr[l];
                l++;
            }
            else{
                temp[i] = arr[r];
                r++;
            }
            i++;
        }
        while(l<=m){
            temp[i] = arr[l];
            l++;
            i++;
        }
        while(r<=e){
            temp[i] = arr[r];
            r++;
            i++;
        }
        for(int j = s; j<=e;j++){
            arr[j] = temp[j-s];
        }
    }
}
