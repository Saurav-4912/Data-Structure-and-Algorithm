package Numerical_Problem;

public class Palindrome {
  public static void main(String[] args) {
    int num = 1331;

    int orignalNumber = num;

    int reverseNum = 0 ;

    while(num > 0){
      int remainder = num % 10;
      reverseNum = reverseNum * 10 + remainder;
      num /= 10;
      //System.out.println(num);
    }
    if(orignalNumber == reverseNum){
      System.out.println("Given number is a palindrome number");
    }else{
      System.out.println("Given number is not palindrome");
    }
  }
}
