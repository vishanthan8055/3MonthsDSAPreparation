package Vis.JavaCodes.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet1380LuckyNumbersInaMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{7,8},{1,2}};
        List<Integer> ans = luckyNumbers(matrix);
        System.out.println(Arrays.toString(ans.toArray()));
    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        boolean isColumnCheck = false;
        for(int i=0;i<matrix.length;i++){
            int j = getMin(matrix[i]);
            int isLucky = checkLucky(i,j,matrix);
            if(isLucky>=0){
                ans.add(matrix[isLucky][j]);
            }
        }
        return ans;
    }

    private static int checkLucky(int i, int j,int[][] matrix) {
        int max = -1;
        int maxi = -1;
        for(int k = 0;k<matrix.length;k++){
            if(matrix[k][j]>max){
                max = matrix[k][j];
                maxi = k;
            }
        }
        if(maxi == i){
            return i;
        }
        return -1;
    }

    private static int getMin(int[] matrix) {
        int m = matrix[0];
        int mi = 0;
        for(int i = 0;i<matrix.length;i++){
            if(matrix[i]<m){
                m = matrix[i];
                mi = i;
            }
        }
        return mi;
    }

}
