package Vis.JavaCodes.Arrays.Sorting;

import java.util.Arrays;

public class Leet1509MinDiff {
    public static void main(String[] args) {
        int[] nums = {5,3,2,4};
        System.out.println(minDifference(nums));
    }
    public static int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int mina = Math.min(nums[nums.length - 4] - nums[0], nums[nums.length - 1] - nums[3]);
        int minb = Math.min(nums[nums.length - 3] - nums[1], nums[nums.length - 2] - nums[2]);
        return Math.min(mina,minb);
    }
}
