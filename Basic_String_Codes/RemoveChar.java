public class RemoveChar {
  public static void main(String[] args) {
    String str = "#Special*Characters&^%$";

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
        sb.append(str.charAt(i));
      }
    }

    System.out.println("Final String : " + sb);
  }
}
