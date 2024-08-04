package Vis.Concepts.Recursion;

import java.util.ArrayList;
import java.util.List;

public class P6_NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4).toString());
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> sol = new ArrayList<>();
        List<String> board = new ArrayList<>();
        for(int i=0;i<n;i++){
            StringBuilder str = new StringBuilder();
            for(int j=0;j<n;j++){
                str.append(".");
            }
            board.add(str.toString());
        }
        nqueens(n,board,0,sol);
        return sol;
    }

    private static void nqueens(int n, List<String> board, int col, List<List<String>> sol) {
        if(col>=n){
            ArrayList<String> t = new ArrayList<>(board);
            sol.add(t);
            return;
        }
        for(int row=0;row<n;row++){
            if(checkSafe(row,col,board,n)){
                StringBuilder s = new StringBuilder(board.get(row));
                s.replace(col,col+1,"Q");
                board.set(row,s.toString());
                nqueens(n,board,col+1,sol);
                s = new StringBuilder(board.get(row));
                s.replace(col,col+1,".");
                board.set(row,s.toString());
            }
        }
    }

    private static boolean checkSafe(int row, int col, List<String> board, int n) {
        int trow = row;
        int tcol = col;

        while(row>=0 && col>=0){
            if(board.get(row).charAt(col) == 'Q'){
                return false;
            }
            row--;
            col--;
        }
        row = trow;
        col = tcol;
        while(col>=0){
            if(board.get(row).charAt(col) == 'Q'){
                return false;
            }
            col--;
        }
        row = trow;
        col = tcol;
        while(row<n && col>=0){
            if(board.get(row).charAt(col) == 'Q'){
                return false;
            }
            col--;
            row++;
        }
        return true;
    }
}
