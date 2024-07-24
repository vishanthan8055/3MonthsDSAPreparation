package Vis;

import java.util.Arrays;
import java.util.HashMap;

public class Leet2191SortTheJumbledNumbers {
    public static void main(String[] args) {
        int[] mapping = {9,8,7,6,5,4,3,2,1,0};
        int[] nums = {9,99,999,9999,999999999};
        System.out.println(Arrays.toString(sortJumbled(mapping,nums)));
    }
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            int mapped = getMapping(i,mapping);
            map.put(i,mapped);
        }
        mergeSort(0,nums.length-1,nums,map);
        return nums;
    }

    private static int getMapping(int n,int[] mapping) {
        int ans = 0;
        int s = 1;
        if(n /10 == 0){
            return mapping[n];
        }
        while(n>0){
            int r = n % 10;
            int m = mapping[r];
            ans = (s * m) + ans;
            s = s * 10;
            n = n / 10;
        }
        return ans;
    }

    public static void mergeSort(int s, int e, int[] arr,HashMap<Integer,Integer> map){
        if(s >= e){
            return;
        }
        int m = s + ((e-s)/2);
        mergeSort(s,m,arr,map);
        mergeSort(m+1,e,arr,map);
        merge(arr,s,m,e,map);
    }

    private static void merge(int[] arr, int s, int m, int e,HashMap<Integer,Integer> map) {
        int[] temp = new int[e + 1];
        int i = 0;
        int l = s;
        int r = m + 1;
        while (l <= m && r <= e) {
            if (map.get(arr[l]) < map.get(arr[r])) {
                temp[i] = arr[l];
                l++;
            } else if(map.get(arr[l]) > map.get(arr[r])){
                temp[i] = arr[r];
                r++;
            }else{
                temp[i] = arr[l];
                l++;
            }
            i++;
        }
        while (l <= m) {
            temp[i] = arr[l];
            l++;
            i++;
        }
        while (r <= e) {
            temp[i] = arr[r];
            r++;
            i++;
        }
        for (int j = s; j <= e; j++) {
            arr[j] = temp[j - s];
        }
    }
}
