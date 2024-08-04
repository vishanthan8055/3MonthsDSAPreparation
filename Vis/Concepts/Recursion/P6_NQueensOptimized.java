package Vis.Concepts.Recursion;

import java.util.ArrayList;
import java.util.List;

public class P6_NQueensOptimized {
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
        boolean[] center = new boolean[n];
        boolean[] lowerDiagonal = new boolean[(2*n)-1];
        boolean[] upperDiagonal = new boolean[(2*n)-1];
        nqueens(n,board,0,sol,center,lowerDiagonal,upperDiagonal);
        return sol;
    }

    private static void nqueens(int n, List<String> board, int col, List<List<String>> sol,boolean[] center,boolean[] lowerDiagonal,boolean[] upperDiagonal) {
        if(col>=n){
            ArrayList<String> t = new ArrayList<>(board);
            sol.add(t);
            return;
        }
        for(int row=0;row<n;row++){
            if(center[row]==false && lowerDiagonal[row+col]==false && upperDiagonal[n-1+col-row]==false){
                center[row] = true;
                lowerDiagonal[row+col] = true;
                upperDiagonal[n-1+col-row] = true;
                StringBuilder s = new StringBuilder(board.get(row));
                s.replace(col,col+1,"Q");
                board.set(row,s.toString());
                nqueens(n,board,col+1,sol,center,lowerDiagonal,upperDiagonal);
                s = new StringBuilder(board.get(row));
                s.replace(col,col+1,".");
                board.set(row,s.toString());
                center[row] = false;
                lowerDiagonal[row+col] = false;
                upperDiagonal[n-1+col-row] = false;
            }
        }
    }
}
