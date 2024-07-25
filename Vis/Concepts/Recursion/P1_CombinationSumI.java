package Vis.Concepts.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class P1_CombinationSumI {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int t = 7;
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> sol = new ArrayList<>();;
        combinationSum(arr,0,t,ans,sol);
        for(List<Integer> s:sol){
            System.out.println(Arrays.toString(s.toArray()));
        }
    }
    public static void combinationSum(int[]arr, int i, int t, List<Integer> ans,List<List<Integer>> sol){
        if(i==arr.length){
            if(t == 0){
                List<Integer> s = new ArrayList<>(ans);
                sol.add(s);
            }
            return;
        }
        if(arr[i]<=t){
            ans.add(arr[i]);
            combinationSum(arr,i,t - arr[i],ans,sol);
            ans.remove(ans.size()-1);
        }
        combinationSum(arr,i+1,t,ans,sol);
    }
}
