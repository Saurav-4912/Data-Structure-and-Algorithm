import java.util.Arrays;

class BubbleSort {

  public static void bubbleSort(int[] arr) {

    int n = arr.length;

    for (int i = n - 1; i >= 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

  }

  public static void main(String[] args) {
    int[] arr = { 94, 125, 6, 39, 10 };

    System.out.println("Before Sorting : " + Arrays.toString(arr));
    bubbleSort(arr);

    System.out.println("After Sorting : " + Arrays.toString(arr));

    // Time Complexity = O(n^2)

  }
}