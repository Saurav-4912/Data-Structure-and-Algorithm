//import java.util.Arrays;

public class Palindrome {
  public static void main(String[] args) {
    String str = "hello";
 
    char s[] = str.toCharArray();

   // System.out.println(Arrays.toString(s));

    String st = "";

    for(int i = s.length-1 ; i>=0; i--){
      st += s[i];
    }

   // System.out.println(st);

    if(str.equals(st)){
      System.out.println("palindrome");
    }else{
      System.out.println("Not palindrome");
    }

  }
}