package Numerical_Problem;

import java.util.Scanner;

public class MaxMinDigitFinder {
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    
    if(num < 0){
      num = -num;   // Handle negative number
    }

    //System.out.println(num);

    int largest = 0 ;
    int smallest = 9;  // Fix: Initialize to 9, the highest possible digit

    while(num > 0 ){
      int remainder = num % 10;

      // check for largest number
      if(remainder > largest){
        largest = remainder;
      }

      // check for smallest number
       if(remainder < smallest ){
        smallest = remainder;
      }

      num /= 10;

    }

    System.out.println(largest);
    System.out.println(smallest);


    sc.close();
  }
}
