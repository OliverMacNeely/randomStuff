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
            if (count_factors(outputTriangularNumbers(i)) == 500) System.out.println(outputTriangularNumbers(i)); break;
        }
    }
    static int outputTriangularNumbers(int num){
        return ((num*(num +1))/2);
    }
    static int count_factors (int num){
        int i,f=1;
        if(num==1)
            return 1;
        else
        {
            for(i=2;i<=(num/2);i++)
            {
                if(num%i == 0)
                    f++;
            }
            return (f+1);
        }
    }
}
