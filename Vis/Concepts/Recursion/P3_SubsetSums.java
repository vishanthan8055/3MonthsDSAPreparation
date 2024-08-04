package Vis.Concepts.Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class P3_SubsetSums {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        System.out.println(subsetSums(arr,arr.size()));
    }
    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> sol = new ArrayList<>();
        helper(arr,n,0,0,sol);
        Collections.sort(sol);
        return sol;
    }

    private static void helper(ArrayList<Integer> arr, int n, int i, int sum, ArrayList<Integer> sol) {
        if(i>=n){
            sol.add(sum);
            return;
        }
        sum = sum + arr.get(i);
        helper(arr,n,i+1,sum,sol);
        sum = sum - arr.get(i);
        helper(arr,n,i+1,sum,sol);
    }
}
