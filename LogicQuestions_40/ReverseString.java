package LogicQuestions_40;

import java.util.Stack;

public class ReverseString {

  public static void main(String[] args) {
    String str = "saurav";
/* 
    char[] character = str.toCharArray();

    for (int i = character.length - 1; i >= 0; i--) {
      System.out.println(character[i]);
    }
  */

   Stack<Character> stack = new Stack<>();

   for(Character ch : str.toCharArray()){
    stack.push(ch);
   }

   while(!stack.isEmpty()){
    System.out.println(stack.pop());
   }


  }

}
