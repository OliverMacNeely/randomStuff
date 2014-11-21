package me.olivermac.Euler;

import me.olivermac.Euler.MasterClasses.Divisible;

/**
 * Created by Oliver on 11/20/2014.
 */
public class HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        int x;
        int count = 0;
        int i;
        for (i = 1; ; i++){
            for (x = 1; ;x++){
                if (Divisible.isDivisible(outputTriangularNumbers(i), x)) {
                    count++;
                if(count == 500) System.out.println(outputTriangularNumbers(i));
                    else count = 0;
                }
            }
        }
    }
    static int outputTriangularNumbers(int num){
        return ((num*(num +1))/2);
    }
}
