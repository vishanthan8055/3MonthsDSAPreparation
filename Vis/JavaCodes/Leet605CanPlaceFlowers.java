package Vis.JavaCodes;

public class Leet605CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {0,0,0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n == 0){
            return true;
        }
        int flowersPut = 0;
        if(flowerbed.length < 2){
            if(flowerbed[0] == 0){
                flowersPut++;
                return (flowersPut == n);
            }
            else{
                return false;
            }
        }
        if(flowerbed.length == 2){
            if(flowerbed[0] == 0 && flowerbed[1] == 0){
                flowersPut++;
                return (flowersPut == n);
            }
            else{
                return false;
            }
        }
        for(int i = 0;i+1<flowerbed.length;i++){
            int b = i-1;
            int c = i;
            int next = i+1;
            if(c == 0 && flowerbed[c] == 0 && flowerbed[next] == 0){
                flowerbed[c] = 1;
                flowersPut++;
                if(flowersPut == n){
                    return true;
                }
                continue;
            }
            else if(c == 0){
                continue;
            }
            if(c == flowerbed.length-2 && flowerbed[flowerbed.length-2] == 0 && flowerbed[next] == 0){
                flowerbed[next] = 1;
                flowersPut++;
                if(flowersPut == n){
                    return true;
                }
                continue;
            }
            if(flowerbed[b] == 0 && flowerbed[c] == 0 && flowerbed[next] == 0){
                flowerbed[c] = 1;
                flowersPut++;
            }
            if(flowersPut == n){
                return true;
            }
        }
        return (flowersPut == n);
    }
}
