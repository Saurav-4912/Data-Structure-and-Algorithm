package Basic_Array_Codes;

import java.util.Arrays;

public class IncreasingOrder {
  public static void main(String[] args) {
    int[] arr = { 7, 2, 9, 4, 1, 5, 8, 3, 6 };

    System.out.println("Before Sorting Array : " + Arrays.toString(arr));
    int length = arr.length;

    for (int i = length - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

        }
      }
    }
    System.out.println("After Sorting Array : " + Arrays.toString(arr));
  }
}
