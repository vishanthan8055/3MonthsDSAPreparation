package Vis.Concepts.Recursion;

import java.util.ArrayList;
import java.util.List;

public class P5_PermutationsApproach1 {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> sol = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        getallPermu(nums, 0, new ArrayList<>(), map, sol);
        return sol;
    }

    private static void getallPermu(int[] nums, int index, ArrayList<Integer> ans, boolean[] map, List<List<Integer>> sol) {
        if (index >= nums.length) {
            ArrayList<Integer> t = new ArrayList<>(ans);
            sol.add(t);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!map[i]) {
                ans.add(nums[i]);
                map[i] = true;
                getallPermu(nums, index + 1, ans, map, sol);
                ans.remove(ans.size() - 1);
                map[i] = false;
            }
        }
    }

}
