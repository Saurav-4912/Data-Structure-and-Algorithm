public class SumNum {
  public static void main(String[] args) {
    String str = "1abc2x30y";

    String num = "";
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      // System.out.println(str.charAt(i));
      if (Character.isDigit(str.charAt(i))) {
        num += str.charAt(i);
      } else {
        if (!num.isEmpty()) {
          sum += Integer.parseInt(num);
          num = "";
        }
      }
    }
    if (!num.isEmpty()) { // Add last number if any
      sum += Integer.parseInt(num);
    }
    System.out.println(sum);
  }
}
