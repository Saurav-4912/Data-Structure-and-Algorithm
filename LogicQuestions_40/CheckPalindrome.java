package LogicQuestions_40;

import java.util.Arrays;

public class CheckPalindrome {
  public static void main(String[] args) {
    String str = "madam";
 
    char[] s = str.toCharArray();

    System.out.println(Arrays.toString(s));

    String newStr = "";

    for(int i = s.length-1; i>=0; i--){
      newStr = newStr + s[i];
    }

    if(str.equals(newStr)){
      System.out.println("Palindrome");
    }else{
      System.out.println("Not Palindrome");
    }
  }
}
