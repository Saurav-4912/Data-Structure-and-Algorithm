package Numerical_Problem;

import java.util.Scanner;

public class SumOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int number = sc.nextInt();

    int originalNumber = number;

    int sum = 0;
    while (number > 0) {
      int remainder = number % 10;
      sum += remainder;
      number /= 10;
    }

    System.out.println("Sum of digit of " + originalNumber + " : " + sum);
    sc.close();
  }
}
