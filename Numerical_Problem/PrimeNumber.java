package Numerical_Problem;

import java.util.Scanner;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int number = sc.nextInt();
    boolean status = isPrime(number);
    if (status) {
      System.out.println("Given number is prime number");
    } else {
      System.out.println("Given number is not prime number");
    }

    sc.close();
  }

  public static boolean isPrime(int number) {

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
