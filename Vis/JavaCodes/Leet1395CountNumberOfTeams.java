package Vis.JavaCodes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Leet1395CountNumberOfTeams {
    public static void main(String[] args) {
        int[] rating = {1,2,3,4};
        System.out.println(numTeams(rating));
    }
    public static int numTeams(int[] rating) {
        int sol = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        return func(rating,0,ans,0);
    }
    public static int func(int[] arr, int i, ArrayList<Integer> ans,int sol){
        if(ans.size() == 3){
//            System.out.println(ans.toString());
            if(checkLess(ans) || checkGreat(ans)){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(i>= arr.length){
//            System.out.println(ans.toString());
            return 0;
        }
        ans.add(arr[i]);
        i++;
        sol = 0;
        sol += func(arr,i,ans,sol);
        ans.remove(ans.size()-1);
        sol += func(arr,i,ans,sol);
        return sol;
    }

    private static boolean checkGreat(ArrayList<Integer> ans) {
        for(int i =1;i<3;i++){
            if(ans.get(i-1)>=ans.get(i)){
                return false;
            }
        }
        return true;
    }
    private static boolean checkLess(ArrayList<Integer> ans) {
        for(int i =1;i<3;i++){
            if(ans.get(i-1)<=ans.get(i)){
                return false;
            }
        }
        return true;
    }
}
