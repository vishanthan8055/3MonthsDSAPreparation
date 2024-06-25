package Vis.JavaCodes.BinarySearch;

public class Leet74Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[i].length-1;
        while(i<matrix.length && j>=0){
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){
                j = j -1;
            }
            else{
                i = i+1;
            }
        }
        return false;
    }
}
