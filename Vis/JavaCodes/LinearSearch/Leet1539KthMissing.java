package Vis.JavaCodes.LinearSearch;

import java.util.ArrayList;

public class Leet1539KthMissing {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k));
    }
    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> m = new ArrayList<>();//dynammic array
        int n=1;
        int i=0;
        while(n<arr[arr.length-1]+1){
            if(arr[i]==n){
                n = n+1;
                i = i+1;
            }
            else{
                m.add(n);
                n = n + 1;
            }
        }
        m.add(n);
        if(k<=m.size()){
            return m.get(k-1);
        }
        else{
            int y = k-m.size();
            return (m.get(m.size()-1)+y);
        }
    }
}
