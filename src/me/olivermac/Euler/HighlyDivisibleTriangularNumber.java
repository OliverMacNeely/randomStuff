package me.olivermac.Euler;

import me.olivermac.Euler.MasterClasses.CountFactors;
import me.olivermac.Euler.MasterClasses.Divisible;
import me.olivermac.Euler.MasterClasses.OutputTriangleNumbers;

/**
 * Created by Oliver on 11/20/2014.
 */
public class HighlyDivisibleTriangularNumber {
    public static void main(String[] args) {
        int i;
        for (i = 0; ; i++){
            System.out.println("" + OutputTriangleNumbers.outputTriangularNumbers(i));
            System.out.println("" + CountFactors.count_factors(OutputTriangleNumbers.outputTriangularNumbers(i)));
            if (CountFactors.count_factors(OutputTriangleNumbers.outputTriangularNumbers(i)) > 500)break;
        }
        System.out.println("" + OutputTriangleNumbers.outputTriangularNumbers(i));
    }
}
