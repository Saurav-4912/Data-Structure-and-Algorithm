package Numerical_Problem;

public class PrimeNumbersInRange {
  public static void main(String[] args) {

    for (int i = 10; i <= 100; i++) {
      boolean isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          // System.out.println(i + " is not prime");
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.print(i + " ");
      }

    }
  }
}
