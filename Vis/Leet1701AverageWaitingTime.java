package Vis;

public class Leet1701AverageWaitingTime {
    public static void main(String[] args) {
        int[][] customers = {{5,2},{5,4},{10,3},{20,1}};
//        [5,2],[5,4],[10,3],[20,1]
        System.out.println(averageWaitingTime(customers));
    }
    public static double averageWaitingTime(int[][] customers) {
        double s = 0;
        int ft = customers[0][0];
        for(int[] x : customers){
            int cat = x[0];
            if(ft<x[0]){
                ft = x[0];
            }
            ft = ft + x[1];
            int wt = ft - cat;
            s +=wt;
        }
        return (s / customers.length);
    }
}
