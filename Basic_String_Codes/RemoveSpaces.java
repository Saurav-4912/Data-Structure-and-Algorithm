public class RemoveSpaces {
  public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog";

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != ' ') {
        sb.append(str.charAt(i));
      }
    }

    System.out.println("Modified String :" + sb);
  }
}
