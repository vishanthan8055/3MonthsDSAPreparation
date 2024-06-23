package Vis.JavaCodes.BinarySearch;

public class Leet367ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if(num<=1){
            return true;
        }
        int s = 1;
        int e = num/2;
        while(s<=e){
            double m = s+((e-s)/2);
            if(m*m == num){
                return true;
            } else if (m*m > num) {
                e = (int) (m - 1);
            }
            else{
                s = (int) (m + 1);
            }
        }
        return false;
    }
}
