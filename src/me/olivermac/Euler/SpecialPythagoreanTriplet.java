package me.olivermac.Euler;

/**
 * Created by Oliver on 11/20/2014.
 */
public class SpecialPythagoreanTriplet {
    public static void main(String[] args) {
      for (int a = 1; a < 1000; a++) {
          for (int b = 2; b < 1000; b++){
              for (int c = 1; c < 1000; c++){
                  if (a + b + c == 1000 && a*a + b*b == c*c) {
                      System.out.println("" + a*b*c);
                      break;
                  }
              }
          }
      }
    }
}
