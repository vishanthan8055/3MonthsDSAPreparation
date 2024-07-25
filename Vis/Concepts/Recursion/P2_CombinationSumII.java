package Vis.Concepts.Recursion;

import java.util.*;

public class P2_CombinationSumII {
    public static void main(String[] args) {
        int[] arr = {2,2,3,6,7};
        int t = 7;
        List<Integer> ans = new ArrayList<>();
        Set<List<Integer>> sol = new HashSet<>();
        combinationSum(arr,0,t,ans,sol);
        List<List<Integer>> sol2 = new ArrayList<>(sol);
        for(List<Integer> s:sol2){
            System.out.println(Arrays.toString(s.toArray()));
        }
    }
    public static void combinationSum(int[]arr, int i, int t, List<Integer> ans, Set<List<Integer>> sol){
        if(i==arr.length){
            if(t == 0){
                List<Integer> s = new ArrayList<>(ans);
                sol.add(s);
            }
            return;
        }
        if(arr[i]<=t){
            ans.add(arr[i]);
            combinationSum(arr,i+1,t - arr[i],ans,sol);
            ans.remove(ans.size()-1);
        }
        combinationSum(arr,i+1,t,ans,sol);
    }
}
