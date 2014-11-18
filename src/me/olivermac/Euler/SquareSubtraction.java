package me.olivermac.Euler;

/**
 * Created by Oliver on 11/18/2014.
 */
public class SquareSubtraction {
    public static void main(String[] args) {
        long finalSum = 0;
        long totalSum = 0;
        long numSquareSum  = 0;
        for (double i = 1;i < 101;i++){
            numSquareSum += Math.pow(i,2);
            System.out.println("num = " + i);
        }
        for (int x = 1;x <101;x++){
            totalSum += x;
            System.out.println("Num = " + x);
        }
        long totalSquareSum;
        totalSquareSum =(long) Math.pow(totalSum, 2);
        finalSum = totalSquareSum - numSquareSum;
        System.out.println(finalSum);
    }
}
