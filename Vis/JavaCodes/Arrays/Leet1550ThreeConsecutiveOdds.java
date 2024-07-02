package Vis.JavaCodes.Arrays;

public class Leet1550ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(arr));
    }
    public static boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int p1 = 0;
        while(p1+2 < arr.length){
            if(arr[p1]%2 != 0 && arr[p1+1]%2 != 0 && arr[p1+2]%2 !=0){
                return true;
            }
            p1++;
        }
        return false;
    }
}
