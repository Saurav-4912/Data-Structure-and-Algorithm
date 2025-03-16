package Basic_Array_Codes;

public class SumOfArray {

  public static int sumOfArray(int[] arr) {

    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = { 11, 33, 22, 55, 88, 44 };

    int sum = sumOfArray(arr);
    System.out.println("Total Sum : " + sum);
  }
}
