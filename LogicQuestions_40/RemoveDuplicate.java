package LogicQuestions_40;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
  public static void main(String[] args) {

    // LinkedHashSet<Integer> L = new LinkedHashSet<>();

    // for (int num : arr) {
    // L.add(num);
    // }
    // System.out.println(L);

    int[] arr = { 1, 2, 2, 3, 4 };

    int[] arr1 = new int[arr.length];

    int index = 0;

    for (int i = 0; i < arr.length; i++) {

      boolean isDuplicate = false;
      for (int j = 0; j < index; j++) {
        if (arr[i] == arr1[j]) {
          isDuplicate = true;
          break;
        }
      }
      if (!isDuplicate) {
        arr1[index] = arr[i];
        index++;
      }
    }
    for (int i = 0; i < index; i++) {
      System.out.print(arr1[i] + " ");
    }
  }
}
