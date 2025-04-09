package Numerical_Problem;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int number = sc.nextInt();

    int a = 0;
    int b = 1;

    System.out.print(a + " " + b + " ");

    for (int i = 2; i <= number; i++) {
      int temp = a + b;
      System.out.print(temp + " ");
      a = b;
      b = temp;

    }

    sc.close();
  }
}
