package me.olivermac.Euler;

/**
 * Created by Oliver on 11/18/2014.
 */
public class BigPrime {
    public static void main(String[] args) {
        int finalNum = 0, counter = 0, i;
        for (i = 2;;i++) {
            if (isPrime(i)) counter++; finalNum = i;
            if (counter == 10001) break;
        }
        System.out.println(finalNum);
    }

    public static boolean isPrime(long  num) {
        for(int i = 2; i < num; i++){
            if(num == 2) return true;

            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
