package Basic_Array_Codes;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = {42, 7, 19, 85, 3, 61, 27, 14};

    for(int i = arr.length-1 ; i >= 0 ; i--){
      System.out.print(arr[i] + " ");
    }
  }
}
