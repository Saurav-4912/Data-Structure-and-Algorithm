package Numerical_Problem;

import java.util.Scanner;

public class PositiveNegative {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int number = sc.nextInt();

    if (number > 0) {
      System.out.println("Number is positive");
    } else {
      System.out.println("Number is negative");
    }

    sc.close();
  }
}
