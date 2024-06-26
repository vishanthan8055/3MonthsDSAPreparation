package Vis.JavaCodes.BinarySearch;

public class Leet287DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int s = 1;
        int e = nums.length-1;
        while(s<e){
            int m = s +((e-s)/2);
            int count = 0;
            for(int x : nums){
                if(x<=m){
                    count++;
                }
            }
            if(count<=m){
                s = m+1;
            }
            else{
                e = m;
            }
        }
        return e;
    }
}
