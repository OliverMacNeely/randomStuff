package me.olivermac.Euler;

/**
 * Created by Oliver on 11/16/2014.
 */
public class LargestThreeDigitPalindrome {
    public static void main(String [] args) {
        String stringNum;
        int startingNum = 0;
        for (int i = 999; i > 900; i--){
            for (int x = 999; x > 900; x--){
                int num = x * i;
                stringNum = "" + num;
                String reverseNum = new StringBuffer(stringNum).reverse().toString();
                if(stringNum.equals(reverseNum)){
                    int newNum = Integer.parseInt(stringNum);
                    if (newNum > startingNum){
                        startingNum = newNum;
                    }
                }
            }
        }
        System.out.print(startingNum);
    }
}
