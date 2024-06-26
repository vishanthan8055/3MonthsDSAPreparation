package Vis.JavaCodes.BinarySearch;

import java.util.Arrays;

public class Leet875KOKOEatingBananas {
    public static void main(String[] args) {
        int[] arr = {805306368,805306368,805306368};
        int h = 1000000000;
        System.out.println(minEatingSpeed(arr,h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int sol = 0;
        int s = 1;
        int e = max(piles);
        while(s<=e) {
            int m = s + ((e - s) / 2);
            long hours = hours(piles,m);
            if(hours <= h){
                sol = m;
                e = m -1;
            }
            else{
                s = m +1;
            }
        }
        return sol;
    }
    public static long hours(int[] piles,int b){
        long hours = 0;
        for(int i : piles){
            int e = i / b + ((i % b == 0) ? 0 : 1);
            hours = hours + e;
        }
        return hours;
    }
    public static int max(int[] piles){
        int max = 0;
        for(int x : piles){
            if(x>max){
                max = x;
            }
        }
        return max;
    }
}
