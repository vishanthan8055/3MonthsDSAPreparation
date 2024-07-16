package Vis.JavaCodes.BinarySearch;

import java.util.Arrays;
import java.util.HashMap;

public class Leet1337KWeakestRowsInAMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        System.out.println(Arrays.toString(kWeakestRows(mat,k)));
    }
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> hp = new HashMap<Integer, Integer>();
        int length = mat.length;
        for(int i = 0; i< length; i++){
            hp.put(i,countSoldiers(mat[i]));
        }
        int min = 101;
        int minIndex = 0;
        int filled = 0;
        while(filled<k){
            for(int i = 0; i < length; i++){
                Integer val = hp.get(i);
                if(hp.containsKey(i) && val <min){
                    min = val;
                    minIndex = i;
                }
            }
            ans[filled] = minIndex;
            hp.remove(minIndex);
            filled++;
            min = 101;
        }
        return ans;
    }

    private static int countSoldiers(int[] line) {
        int sum = 0;
        int s = 0;
        int e = line.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(line[m] == 1){
                s = m + 1;
                sum = m+1;
            }
            else{
                e = m - 1;
            }
        }
        return sum;
    }
}
