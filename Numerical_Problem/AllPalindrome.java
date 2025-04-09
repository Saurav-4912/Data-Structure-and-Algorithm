package Numerical_Problem;

import java.util.Scanner;

public class AllPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Begin :");
    int begin = sc.nextInt();

    System.out.println("End :");
    int end = sc.nextInt();

    for (int i = begin; i <= end; i++) {

      int num = i;
      int orignalNumber = num;  // Store the original value for comparison
      int reverseNum = 0;
      while (num > 0) {
        int remainder = num % 10;
        reverseNum = reverseNum * 10 + remainder;

        num /= 10;
      }

      if (orignalNumber == reverseNum) {
        System.out.print(orignalNumber + ",");
      }

    }

    sc.close();
  }
}
