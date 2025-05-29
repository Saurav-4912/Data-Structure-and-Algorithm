public class Pattern4 {
  public static void main(String[] args) {
    int n = 4;
    printSquareAlphabetsV1(n);

  }

  public static void printSquareAlphabetsV1(int n) {
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= n; j++) {
        System.out.print((char) (j + 64));
      }

      System.out.println();
    }
    System.out.println("-----------------------");
  }

}
