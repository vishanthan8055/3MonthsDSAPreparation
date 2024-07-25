package Vis.Concepts.Recursion;

public class AllPatterns {
    public static void main(String[] args) {

    }
    public int printTheCount(int arr[],int n, int sum)
    {
        return printSubsequenceSum(0,arr,n,0,sum);
    }
    private static int printSubsequenceSum(int i, int[] arr, int n, int sum,int k) {
        if(sum>k){
            return 0;
        }
        if(i >= n && sum == k){
            return 1;
        } else if (i>=n) {
            return 0;
        }
        sum += arr[i];
        int l = printSubsequenceSum(i+1,arr,n,sum,k);
        int r = printSubsequenceSum(i+1,arr,n,sum - arr[i],k);
        return l+r;
    }
}

