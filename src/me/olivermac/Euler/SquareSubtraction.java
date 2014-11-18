package me.olivermac.Euler;

/**
 * Created by Oliver on 11/18/2014.
 */
public class SquareSubtraction {
    public static void main(String[] args) {
        double finalSum = 0;
        double totalSum = 0;
        double numSquareSum  = 0;
        for (double i = 0;i < 101;i++){
            numSquareSum += Math.pow(i,2);
        }
        for (int x = 0;x <101;x++){
            totalSum += x;
        }
        double totalSquareSum;
        totalSquareSum = Math.pow(totalSum, 2);
        finalSum = numSquareSum-totalSquareSum;
        System.out.println(finalSum);
    }
}
