
public class ReverseString {
  public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog";

    String[] s = str.split("");

    for (int i = s.length - 1; i >= 0; i--) {
      System.out.print(s[i]);
    }
  }
}
