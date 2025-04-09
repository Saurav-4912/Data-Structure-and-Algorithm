// Palindrome Number
// Leetcode Problem : Q9


class Solution {
  public boolean isPalindrome(int x) {

      if(x < 0){
          return false;
      }
      int num = x;
      int reverse = 0;

      while(x != 0){
          int remainder = x % 10;
          reverse = reverse * 10 + remainder;
          x /= 10;
      }
      
      if(num == reverse){
          return true;
      }else{
          return false;
      }
  }
}
