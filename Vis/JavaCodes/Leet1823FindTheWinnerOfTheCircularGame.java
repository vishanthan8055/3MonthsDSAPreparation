package Vis.JavaCodes;

import java.util.ArrayList;

public class Leet1823FindTheWinnerOfTheCircularGame {
    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        System.out.println(findTheWinner(n,k));
    }
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> members = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            members.add(i);
        }
        int s = 0;
        while(members.size()>1){
            int op = s + k - 1;
            int out;
            if(op> members.size()-1){
                 out = (op% members.size());
            }
            else{
                out = op;
            }
            members.remove(out);
            if(out> members.size()-1){
                s = (out) % members.size();
            }
            else{
                s = out;
            }
        }
        return members.get(0);
    }
}
