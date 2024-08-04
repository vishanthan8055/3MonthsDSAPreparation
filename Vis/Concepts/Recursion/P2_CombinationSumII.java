package Vis.Concepts.Recursion;

import java.util.*;

public class P2_CombinationSumII {
    public static void main(String[] args) {
        int[] arr = {10,1,2,7,6,1,5};
        int t = 8;
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> sol = new ArrayList<>();
        combinationSum(arr,0,t,ans,sol);
        List<List<Integer>> sol2 = new ArrayList<>(sol);
        for(List<Integer> s:sol2){
            System.out.println(Arrays.toString(s.toArray()));
        }
    }
    public static void combinationSum(int[]arr, int i, int t, List<Integer> ans, List<List<Integer>> sol){
        if(t == 0){
            List<Integer> s = new ArrayList<>(ans);
            sol.add(s);
            return;
        }
        if(i>=arr.length){
            return;
        }
        int x = arr[i]-1;
        for(int k = i;k<arr.length;k++){
            if(x != arr[k]){
                if(arr[k]>t){
                    break;
                }
                x = arr[k];
                ans.add(arr[k]);
                combinationSum(arr,k+1,t-arr[k],ans,sol);
                ans.remove(ans.size()-1);
            }
        }
    }
}
