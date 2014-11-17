package Euler;

/**
 * Created by Oliver on 11/16/2014.
 */
public class SmallestMultiple {
    public static void main(String[] args) {
        int smallestMultiple = 0;
        int i;
        for (i = 1; ; i++) {
            int x;
            for (x = 1; x <= 20; x++) {
                if (i % x == 0) continue;
                else break;
            }
            if (i % x == 0) break;
        }
        smallestMultiple = i;
        System.out.println(smallestMultiple);
    }

}
