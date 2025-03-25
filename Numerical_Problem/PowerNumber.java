package Numerical_Problem;

import java.util.Scanner;

public class PowerNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the base : ");
    int base = sc.nextInt();

    System.out.println("Enter the exponent :");
    int exponent = sc.nextInt();

    int ans = 1;
    for (int i = 1; i <= exponent; i++) {
      ans = ans * base;
    }

    System.out.println("Answer : " + ans);

    sc.close();

  }
}
