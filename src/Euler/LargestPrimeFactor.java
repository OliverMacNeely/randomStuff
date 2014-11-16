package Euler;

public class LargestPrimeFactor {
    public static void main (String[] args) {
        System.out.println(findGreatestPrimeFactor(600851475143L));
    }
    public static int findGreatestPrimeFactor(Long n) {
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) n /= i;
        }
        return i;
    }
}
