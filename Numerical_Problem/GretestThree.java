package Numerical_Problem;

import java.util.Scanner;

public class GretestThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number : ");
    int num1 = sc.nextInt();

    System.out.println("Enter the second number : ");
    int num2 = sc.nextInt();

    System.out.println("Enter the third number");
    int num3 = sc.nextInt();

    if (num1 > num2 && num1 > num3) {
      System.out.println(num1 + " is a greater number");
    } else if (num2 > num1 & num2 > num3) {
      System.out.println(num2 + " is a greater number");
    } else {
      System.out.println(num3 + " is a greater number");
    }

    sc.close();
  }
}
