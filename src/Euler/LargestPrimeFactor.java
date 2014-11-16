package Euler;

/**
 * Created by Oliver on 11/15/2014.
 */
public class LargestPrimeFactor {
    public static void main (String[] args) {
        System.out.println(findGreatestPrimeFactor(600851475143L));
    }
    public static Long findGreatestPrimeFactor(Long n) {
        Long i;
        for (i = (Long) (n - 1); i < n; i--) {
            if (n % i == 0) {
                break;
            }
        }

        return i;
    }
}
