package Vis.JavaCodes.HashTable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class Leet2418SortThePeople {
    public static void main(String[] args) {

    }
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer,String> map = new HashMap<>();
        int length = names.length;
        for(int i = 0; i< length; i++){
            map.put(heights[i],names[i]);
        }
        bubbleSort(heights);
        for(int i = 0; i< length; i++){
            names[i] = map.get(heights[i]);
        }
        return names;
    }
    public static void bubbleSort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            boolean isSwapped = false;
            for(int j = 0; j< length -1-i; j++){
                 if(arr[j]<arr[j+1]){
                     int temp = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp;
                     isSwapped = true;
                 }
            }
            if(!isSwapped){
                break;
            }
        }
    }
}
