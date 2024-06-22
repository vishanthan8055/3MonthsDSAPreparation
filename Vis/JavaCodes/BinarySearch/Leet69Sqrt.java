package Vis.JavaCodes.BinarySearch;

public class Leet69Sqrt {
    public static void main(String[] args) {

        int x = 2147395599;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if(x<=1){
            return x;
        }
        int s = 1;
        int e = x/2;
        while(s<=e){
            long m = s+((e-s)/2);
            if((long) m*m == x){
                return (int)m;
            }
            else if((long) m*m  < x){
                s = (int)m + 1;
            }
            else{
                e = (int)m - 1;
            }
        }
        return e;
    }
}
