package Vis.JavaCodes.Math;

public class Leet1518WaterBottles {
    public static void main(String[] args) {
        int n = 17;
        int e = 3;
        System.out.println(numWaterBottles(n,e));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int s = numBottles;
        int remaingBottles = numBottles;

        while(remaingBottles>=numExchange){
            int remDrink = remaingBottles / numExchange;
            s = s + remDrink;
            remaingBottles = remaingBottles - (remDrink)*numExchange;
            remaingBottles += remDrink;
        }
        return s;
    }
}
