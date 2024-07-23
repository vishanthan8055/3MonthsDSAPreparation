package Vis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Leet1636SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        Integer[] values = map.values().toArray(new Integer[0]);
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        bubbleSortArr(keys);
        bubbleSortArrAsc(values);

        int k = 0;
        for(int i=0;i< values.length;i++){
            for(int j = 0;j<keys.length;j++){
                int val = values[i];
                int key = keys[j];
                int c = map.get(key);
                if(val == c){
                    for(int l=0;l<val;l++){
                        nums[k] = key;
                        k++;
                    }
                    map.put(key,0);
                }
            }
        }
        return nums;
    }

    private static void bubbleSortArrAsc(Integer[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j+1< nums.length-i;j++){
                if((int)nums[j]>(int)nums[j+1]){
                    int temp = (int)nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    private static void bubbleSortArr(Integer[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j+1< nums.length-i;j++){
                if((int)nums[j]<(int)nums[j+1]){
                    int temp = (int)nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
