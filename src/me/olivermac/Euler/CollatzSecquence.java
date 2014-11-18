package me.olivermac.Euler;

import java.util.ArrayList;

/**
 * Created by Oliver on 11/6/2014.
 */
public class CollatzSecquence {

    public ArrayList[] collatzValues = new ArrayList[1000000];

    public static void main(String[] args) {
        System.out.println("Terms: " + highestCollatzUnder(1000000));

    }
    public static int highestCollatzUnder(int max) {
        int highestChain = 0;
        for(int i = 0; i < max; i++) {
            if (getTermsInCollatz(i) > max) {
                highestChain = getTermsInCollatz(i);
            }
        }
        return highestChain;
    }
    public static int getTermsInCollatz(int number) {
       int steps = 0;
        while(number != 1){
            if( number % 2 == 0) {
            number /= 2;
             }
            else {
                number = (number*3) + 1;
            }
            steps++;
        }
        return steps;
    }

}
