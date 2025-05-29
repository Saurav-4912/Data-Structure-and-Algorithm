public class Pattern6 {
  public static void main(String[] args) {

    printTable(1, 10);
  }

  public static void printTable(int start, int end) {
    for (int i = 1; i <= 10; i++) {

      for (int j = start; j <= end; j++) {
        // System.out.print(i*j + " ");
        System.out.printf("%3d ", i * j);
      }

      System.out.println();
    }
    System.out.println("-----------------------");
  }

}
