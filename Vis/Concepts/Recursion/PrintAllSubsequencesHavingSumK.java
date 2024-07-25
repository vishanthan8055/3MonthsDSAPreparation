package Vis.Concepts.Recursion;

import java.util.ArrayList;

public class PrintAllSubsequencesHavingSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int k = 2;
        ArrayList<Integer> ans = new ArrayList<>();
        printSubsequenceSum(0,arr,ans,arr.length,0,k);
    }

    private static void printSubsequenceSum(int i, int[] arr,ArrayList<Integer> ans, int n, int sum,int k) {
        if(i >= n && sum == k){
            System.out.println(ans.toString());
            return;
        } else if (i>=n) {
            return;
        }
        ans.add(arr[i]);
        sum += arr[i];
        printSubsequenceSum(i+1,arr,ans,n,sum,k);
        ans.remove(ans.size()-1);
        printSubsequenceSum(i+1,arr,ans,n,sum - arr[i],k);
    }

}
