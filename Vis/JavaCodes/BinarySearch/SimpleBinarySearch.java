package Vis.JavaCodes.BinarySearch;

public class SimpleBinarySearch {
    public static void main(String[] args) {
        //simple binary search
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 1; i<11;i++){
            System.out.println(binarySearch(arr,i));
        }
    }

    private static int binarySearch(int[] arr, int t) {
        int s = 0;
        int e = arr.length - 1;
        while(s<=e){
            int m = s + ((e-s)/2);
            if(arr[m] == t){
                return m;
            }
            else if(arr[m] < t){
                s = m + 1;
            }
            else{
                e = m - 1;
            }
        }
        return -1;
    }
}
