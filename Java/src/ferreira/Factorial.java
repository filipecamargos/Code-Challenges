package ferreira;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(loopFactorial(5));
    }

    //Recursive
    public static int recursiveFactorial(int n) {
        if (n == 1) {
            return 1;
        }

        return recursiveFactorial(n - 1) * n;
    }

    //No recursive
    public static int loopFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
    
}
