package Numerical_Problem;

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = sc.nextInt();

    int originalNum = num;
    int reverseNum = 0;
    while (num > 0) {
      int remainder = num % 10;
      reverseNum += remainder * remainder * remainder;
      num /= 10;
    }

    if (originalNum == reverseNum) {
      System.out.println("Given number is armstrong number ");
    }else{
      System.out.println("Given number is not armstrong number");
    }

    sc.close();
  }
}
