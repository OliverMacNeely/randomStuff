package me.olivermac.Euler.MasterClasses;

/**
 * Created by Oliver on 11/20/2014.
 */
public class CountFactors {
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
