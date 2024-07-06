package Vis.JavaCodes.BinarySearch;

public class Leet1095FindInMountainArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};
        int target = 2;
        System.out.println(findInMountainArray(target,array));
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = findPeak(mountainArr);
        int a = binery(mountainArr,0,peak,true,target);
        int b = binery(mountainArr,peak+1,mountainArr.length-1,false,target);
        if(a == -1)
        {
            return(b);
        }else if(b == -1){
            return(a);
        }
        return Math.min(a,b);
    }

    private static int binery(int[] mountainArr, int s, int e, boolean b,int target) {
        if(b) {
            while (s <= e) {
                int m = s + ((e - s) / 2);
                if (mountainArr[m] == target) {
                    return m;
                } else if (mountainArr[m] > target) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        else{
            while (s <= e) {
                int m = s + ((e - s) / 2);
                if (mountainArr[m] == target) {
                    return m;
                } else if (mountainArr[m] > target) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }

    private static int findPeak(int[] mountainArr) {
        int s = 0;
        int e = mountainArr.length-1;
        while(s<e){
            int m = s + ((e-s)/2);
            if(m < mountainArr.length && mountainArr[m] < mountainArr[m+1]){
                s = m + 1;
            } else if (m > 0 && mountainArr[m] > mountainArr[m+1]) {
                e = m;
            } else if (m == 0 && mountainArr[m] < mountainArr[0]) {
                s = 0;
            }
        }
        return e;
    }
}
