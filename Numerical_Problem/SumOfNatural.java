package Numerical_Problem;

public class SumOfNatural {
  public static void main(String[] args) {

    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }

    System.out.println("Sum of first 100 natural number : " + sum);
  }
}
