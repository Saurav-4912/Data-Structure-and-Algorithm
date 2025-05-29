public class Pattren3 {
  public static void main(String[] args) {
    int n = 4;

    printSquareNumbersV2(n);
  }

  public static void printSquareNumbersV2(int n) {
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= n; j++) {
        System.out.print(i);
      }

      System.out.println();
    }
    System.out.println("-----------------------");
  }

}
