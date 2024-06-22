package Vis.JavaCodes.BinarySearch;

public class Leet268MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        int ars = 0;
        for(int i=0;i<n;i++){
            ars+=nums[i];
        }
        return sum-ars;
    }
}
