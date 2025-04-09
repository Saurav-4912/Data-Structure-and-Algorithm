package Numerical_Problem;

import java.util.Scanner;

public class ReverseNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();

    int reverseNumber = 0;

    while (num > 0) {
      int remainder = num % 10;
      reverseNumber = reverseNumber * 10 + remainder;
      num /= 10;
    }

    System.out.println(reverseNumber);

    sc.close();

  }
}
