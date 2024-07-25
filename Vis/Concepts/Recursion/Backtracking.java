package Vis.Concepts.Recursion;

public class Backtracking {
    public static void main(String[] args) {
//        printOneToN(5);//write without + operator is question
        printNtoOne(5,1);
    }
    public static void printNtoOne(int n,int i){
        if(i>n){
            return;
        }
        printNtoOne(n,i+1);
        System.out.println(i);
    }
    public static void printOneToN(int n){
        if(n==0){
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }
}
