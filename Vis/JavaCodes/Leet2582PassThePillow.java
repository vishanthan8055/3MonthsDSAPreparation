package Vis.JavaCodes;

public class Leet2582PassThePillow {
    public static void main(String[] args) {
        int n = 18;
        int time = 38;
        System.out.println(passThePillow(n,time));
    }
    public static int passThePillow(int n, int time) {
        int switchX = 1;
        int i = 1;
        int count = 0;
        while(count < time){
            if(switchX == 1 && i<n){
                count++;
                i = i + 1;
            }else
            if(switchX == -1 && i-1 > 0){
                count++;
                i = i - 1;
            }
            else if( i == n && switchX == 1){
                count++;
                i = i - 1;
                switchX = -1;
            }else if(i == 1 && switchX == -1){
                count++;
                i = i + 1;
                switchX = 1;
            }
        }
        return i;
    }
}
