package Vis.JavaCodes.BinarySearch;

import java.util.Arrays;

public class Leet875KOKOEatingBananas {
    public static void main(String[] args) {
        int[] arr = {312884470};
        int h = 968709470;
        System.out.println(minEatingSpeed(arr,h));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int sol = 0;
        int s = 0;
        int e = 0;
        for(int x : piles){
            s+=x;
            if(x>e){
                e = x;
            }
        }
         s = s / h + ((s % h == 0) ? 0 : 1);

        while(s<=e) {
            int m = s + ((e - s) / 2);
            boolean hours = hours(piles,m,h);
            if(hours){
                sol = m;
                e = m -1;
            }
            else{
                s = m +1;
            }
        }
        return sol;
    }
    public static boolean hours(int[] piles,int b,int h){
        long hours = 0;
        for(int i : piles){
            int e = i / b + ((i % b == 0) ? 0 : 1);
            hours = hours + e;
            if(hours > h){
                return false;
            }
        }
        return (hours <= h);
    }
}
