package Vis.Concepts.Recursion;

public class ParameterizedAndFunctional {
    public static void main(String[] args) {
//        parameterizedSummation(3,0);
//        System.out.println(functionalSummation(5));
//        paramFactorial(4,1);
        System.out.println(functionalFactorial(5));
    }

    private static int functionalFactorial(int n) {
        if(n == 1){
            return 1;
        }
        return n * functionalFactorial(n-1);
    }

    private static void paramFactorial(int i, int product) {
        if(i == 1){
            System.out.println(product);
            return;
        }
        paramFactorial(i-1,product*i);
    }

    private static int functionalSummation(int n) {
        if(n == 1){
            return 1;
        }
        return n + functionalSummation(n-1);
    }

    private static void parameterizedSummation(int i,int sum) {
        if(i == 0){
            System.out.println(sum);
            return;
        }
        parameterizedSummation(i-1,sum+i);//playing with parameters and simply print and break the function to stop(return;)
    }

}

