package Vis.JavaCodes.Arrays;

import java.util.Arrays;

public class Leet1TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int t = 9;
        System.out.println(Arrays.toString(twoSum(arr,t)));
    }
    public static int[] twoSum(int[] nums, int target) {
            int length = nums.length;
            for(int i = 0; i< length; i++){
                int need = target - nums[i];
                for(int j = i+1; j< length; j++){
                    if(nums[j]==need){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{-1,-1};
    }
}
