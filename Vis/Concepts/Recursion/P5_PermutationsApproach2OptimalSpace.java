package Vis.Concepts.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P5_PermutationsApproach2OptimalSpace {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums).toString());
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        getallPermu(nums, 0, sol);
        return sol;
    }

    private static void getallPermu(int[] nums, int index, List<List<Integer>> sol) {
        if(index>=nums.length){
            List<Integer> t = new ArrayList<Integer>(nums.length);
            for (int i : nums)
            {
                t.add(i);
            }
            sol.add(t);
            return;
        }
        for(int i = index;i<nums.length;i++){
            swap(nums,index,i);
            getallPermu(nums,index+1,sol);
            swap(nums,index,i);
        }
    }
    private static void swap(int[] nums, int a, int b){
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

}
