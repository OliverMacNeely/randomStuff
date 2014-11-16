package Euler;

/**
 * Created by Oliver on 11/6/2014.
 */
class EvenFibonacciSum {
    public static void main(String [] args) {
        int fib1=0;
        int fib2=1;
        int sum = 0;
        int fibonacci;
        for (int n = 0; ;n++){
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
            if (fibonacci > 4000000) break;
            else {
                if (isEven(fibonacci) == true) {
                    sum += fibonacci;
                }
            }
        System.out.println(sum);
        }
    }
    private static boolean isEven(int x) {
        if ((x % 2) == 0) return true;
        else return false;
    }
}


