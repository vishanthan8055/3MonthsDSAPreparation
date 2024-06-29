package Vis.JavaCodes.BinarySearch;

public class Leet852PeakIndexinMountain {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int m = s+((e-s)/2);
            if(m<arr.length-1 && arr[m]<arr[m+1]){
                s = m + 1;
            }
            else if(m>0 && arr[m]>arr[m+1]) {
                e = m;
            }
            else if(m==arr.length-1 && arr[m]<arr[0]){
                s = 0;
            }
            else{
                e = arr.length-1;
            }
        }
        return e;
    }
}
