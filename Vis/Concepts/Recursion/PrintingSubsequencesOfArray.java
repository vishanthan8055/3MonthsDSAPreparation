package Vis.Concepts.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintingSubsequencesOfArray {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        ArrayList<Integer> ans = new ArrayList<>();
        printSubsequence(0,ans,arr,arr.length);
    }
    public static void printSubsequence(int i, ArrayList<Integer> ans,int[] arr, int n){
        if(i >= n){
            System.out.println(Arrays.toString(ans.toArray()));
            return;
        }
        ans.add(arr[i]); //taking part-falls left side of the tree
        printSubsequence(i+1,ans,arr,n);
        ans.remove(ans.size()-1); //not taking part falls right of the tree
        printSubsequence(i+1,ans,arr,n);
    }
}
