package Vis.Concepts.Recursion;

public class Recursion {
    public static void main(String[] args) {
//        printFive(0);
//        printOneToN(1,5);
        printNtoOne(5);
    }

    private static void printNtoOne(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        printNtoOne(--n);
    }

    private static void printOneToN(int i,int n) {
        if(i == n){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printOneToN(++i,n);
    }

    private static void printFive(int count) {
        if(count == 5){
            return;
        }
        System.out.println(count+1 + " vishanthan");
        printFive(count+1);
    }

}
