package Basic_Array_Codes;

import java.util.Arrays;

public class Median {
  public static void main(String[] args) {
    int[] arr = { 42, 7, 19, 85, 3, 61, 27, 14, 15 };

    Arrays.sort(arr);

    int n = arr.length;
    double median;

    if (n % 2 == 1) {
      median = arr[n / 2]; // Odd number of elements, middle one is the median
    } else {
      median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0; // Even number of elements, average of two middle values
    }

    System.out.println("Median of given array : " + median);
  }
}
