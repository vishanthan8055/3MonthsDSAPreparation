package Vis.Concepts.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_SubsetSumII {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Arrays.sort(nums);
        System.out.println(subsetsWithDup(nums).toString());
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        subset2(nums,0,new ArrayList<>(),sol);
        return sol;
    }

    private static void subset2(int[] nums, int index, ArrayList<Integer> ans, List<List<Integer>> sol) {
        if(index>=nums.length){
            ArrayList<Integer> t = new ArrayList<>(ans);
            sol.add(t);
            return;
        }
        int prev = nums[index]-1;
        sol.add(new ArrayList<>(ans));
        for (int i = index; i < nums.length; i++) {
            if(nums[i] != prev){
                ans.add(nums[i]);
                subset2(nums,i+1,ans,sol);
                ans.remove(ans.size()-1);
                prev = nums[i];
            }
        }
    }
}
