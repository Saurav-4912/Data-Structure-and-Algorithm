package LogicQuestions_40;

public class FactorialNumber {
  public static void main(String[] args) {
    // 5! = 5 * 4 * 3 * 2 * 1

    int n = 5;
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    System.out.println(fact);
  }
}
