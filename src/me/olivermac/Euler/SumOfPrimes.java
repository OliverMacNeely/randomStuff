package me.olivermac.Euler;

/**
 * Created by Oliver on 11/18/2014.
 */
public class SumOfPrimes {
    public static void main(String[] args) {
        long i, sum = 0;
        for (i = 2; i < 2000000;i++){
          if (BigPrime.isPrime(i)) sum += i;
        }
        System.out.println(sum);
    }
}
