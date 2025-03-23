public class RemoveVowels {
  public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog";

    StringBuilder sb = new StringBuilder();

    for(int i = 0 ; i< str.length() ; i++){
      if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && 
      str.charAt(i) != 'o' && str.charAt(i) != 'u' &&
      str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && 
      str.charAt(i) != 'O' && str.charAt(i) != 'U'){
        sb.append(str.charAt(i));
      }
    }

    System.out.println(sb);

  }
}
