package LogicQuestions_40;

import java.util.Arrays;

public class SortArray {
  public static void main(String[] args) {
    int[] arr = { 5, 2, 8, 1, 3 };
    /*
     * // Bubble sort logic
     * 
     * for(int i = 0; i<arr.length; i++){
     * for(int j = i+1; j<arr.length; j++){
     * if(arr[j] > arr[i]){
     * int temp = arr[i];
     * arr[i] = arr[j];
     * arr[j] = temp;
     * }
     * }
     * }
     * for (int i = 0; i < arr.length; i++) {
     * System.out.println(arr[i]);
     * }
     */

    // Another Approch

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
