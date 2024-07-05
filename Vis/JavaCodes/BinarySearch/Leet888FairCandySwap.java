package Vis.JavaCodes.BinarySearch;

import java.util.Arrays;

public class Leet888FairCandySwap {
    public static void main(String[] args) {
        int[] arr1 = {35,17,4,24,10};
        int[] arr2 = {63,21};
        System.out.println(Arrays.toString(fairCandySwap(arr1,arr2)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = 0;
        int b = 0;
        Arrays.sort(bobSizes);
        for(int i:aliceSizes){
            a+=i;
        }
        for(int i:bobSizes){
            b+=i;
        }
        int t = 0;
        if(a>b){
            t = a - 1;
        }
        else{
            t = a + 1;
        }for(int i:aliceSizes){
            int s = 0;
            int e = bobSizes.length-1;
            while(s<=e){
                int m = s + ((e-s)/2);
                int as = (a - i) + bobSizes[m];
                int bs = (b - bobSizes[m]) + i;
                if(as == bs){
                    return new int[] {i,bobSizes[m]};
                } else if (as < bs) {
                    s = m+1;
                }else{
                    e = m -1;
                }
            }
        }
        return new int[]{0,0};
    }
}
