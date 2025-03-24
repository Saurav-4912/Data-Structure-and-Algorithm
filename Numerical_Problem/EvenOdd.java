package Numerical_Problem;

import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int number = sc.nextInt();

    if(number % 2 == 0){
      System.out.println("Given number is even number");
    }else{
      System.out.println("Given number is odd number");
    }

    sc.close();
  }
}
