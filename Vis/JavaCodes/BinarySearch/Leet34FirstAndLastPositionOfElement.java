package Vis.JavaCodes.BinarySearch;

import java.util.Arrays;

public class Leet34FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int t = 1;
        System.out.println(Arrays.toString(searchRange(nums,t)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = bs(nums,target,true);
        if(ans[0] != -1){
            ans[1] = bs(nums,target,false);
        }
        return ans;
    }

    private static int bs(int[] nums, int target, boolean findStartIndex) {
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;
        while(s<=e){
            int m = s + ((e-s)/2);
            if(nums[m] < target){
                s = m + 1;
            } else if (nums[m] > target) {
                e = m - 1;
            }
            else {
                ans = m;
                if(findStartIndex){
                    e = m - 1;
                }
                else{
                    s = m + 1;
                }
            }
        }
        return ans;
    }
}
