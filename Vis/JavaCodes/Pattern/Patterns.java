package Vis.JavaCodes.Pattern;

public class Patterns {
    public static void main(String[] args) {
//        pattern1(5);
//        pattern5(5);
//        pattern6(5);
//            pattern7(5);
//        pattern8(5);
//        pattern9(5);
//        pattern10(5);
//        pattern11(4);
//        pattern12(5);
//        pattern13(5);
//        pattern14(5);
//        pattern15(10);
        pattern16(4);
    }

    private static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n+1-j+" ");
            }
            System.out.println();
        }
    }

    private static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||i==n-1){
                    System.out.print("*");
                } else if (j==0 ||j==n-1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void pattern14(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 0; j < (n*2) - (i+1)*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for (int j = 2; j < (i+1)*2; j++) {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern13(int n) {
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for (int j = 2; j < (i+1)*2; j++) {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j = 0; j < (n*2) - (i+1)*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern12(int n) {
        int counter = 1;
        for(int i=0;i<n;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }

    private static void pattern11(int n) {
        for(int i=0;i<n;i++){
            int j = 0;
            for(j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            for(int k=0;k<(n*2)-(i+1)*2;k++){
                System.out.print(" ");
            }
            for(int m=j;m>0;m--){
                System.out.print(m);
            }
            System.out.println();
        }
    }

    private static void pattern10(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                int rem = (i+1) % 2;
                if(rem == 1){
                    System.out.print((j+1)%2);
                }else{
                    System.out.print((j+1)%2 == 1?0:1);
                }
            }
            System.out.println();
        }
    }


    private static void pattern9(int n) {
        for(int i = 0; i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern8(int n) {
        int helper = 1;
        for(int i = 0;i <n;i++){
            for(int j = n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<helper;k++){
                System.out.print("*");
            }
            System.out.println();
            helper+=2;
        }
        for(int i = 0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<((n-i)*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern7(int n) {
        for(int i = 0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<((n-i)*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern6(int n) {
        int helper = 1;
        for(int i = 0;i <n;i++){
            for(int j = n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<helper;k++){
                System.out.print("*");
            }
            System.out.println();
            helper+=2;
        }

    }


    private static void pattern5(int n) {
        for(int i = 0;i<n;i++){
            for(int j = n; j>i;j--){
                System.out.print(n-j +1);
            }
            System.out.println();
        }

    }
    private static void pattern4(int n) {
        for(int i = 0;i<n;i++){
            for(int j = n; j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern3(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0; j<=i;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }

    }
    private static void pattern2(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
