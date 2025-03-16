import java.util.Arrays;

public class ImprovedBubbleSort {

  public static void improvedBubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = n - 1; i >= 0; i--) {

      // System.out.println("Hello");

      boolean flag = true;

      for (int j = 0; j < i; j++)
       {
        if (arr[j] > arr[j + 1])
         {
          flag = false;
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      if (flag == true)
       {
        break;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 11, 22, 33, 44, 55 };

    // int[] arr = {94,125,6,39,10};
    System.out.println("Before Sorting : " + Arrays.toString(arr));

    improvedBubbleSort(arr);

    System.out.println("After Sorting : " + Arrays.toString(arr));

  }
}
