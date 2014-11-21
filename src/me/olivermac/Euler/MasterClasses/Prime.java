package me.olivermac.Euler.MasterClasses;

/**
 * Created by Oliver on 11/20/2014.
 */
public class Prime {
    public static boolean isPrime(int num){
        for(int i = 2; i < num; i++){
            if(num == 2) return true;

            if(num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
