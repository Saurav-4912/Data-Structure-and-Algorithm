package Numerical_Problem;

import java.util.Scanner;

public class PerfectNum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number :");
    int number = sc.nextInt();

    int originalNum = number ;
    int sum = 0 ;
    for(int  i = 1 ; i < number ; i++){
      if(number % i == 0){
        //System.out.println(i);
        sum += i;
      }
    }
    if(originalNum == sum){
      System.out.println("Given number is perfect number");
    }else{
      System.out.println("Given number is not perfect number");
    }

    sc.close();
  }
}
