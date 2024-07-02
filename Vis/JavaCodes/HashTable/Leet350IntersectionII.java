package Vis.JavaCodes.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Leet350IntersectionII {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> set1 = new HashMap<>();
        for (int n1:nums1) {
            if(set1.containsKey(n1)){
                int i = set1.get(n1).intValue();
                set1.put(n1,i+1) ;
            }
            else {
                set1.put(n1,1) ;
            }
        }
        HashMap<Integer,Integer> set2 = new HashMap<>();
        for (int n2:nums2
        ) {
            if(set2.containsKey(n2)){
                int i = set2.get(n2).intValue();
                set2.put(n2,i+1) ;
            }
            else {
                set2.put(n2,1) ;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        int i =0;
        for(Integer x : set1.keySet()){
            if(set2.containsKey(x)){
                int m = set1.get(x);
                int max = set2.get(x);
                int min = m<max ? m:max;
                for (int ii = 0; ii < min; ii++) {
                    result.add(x);
                }
            }
        }
        return result.stream().mapToInt(u -> u).toArray();
    }
}
