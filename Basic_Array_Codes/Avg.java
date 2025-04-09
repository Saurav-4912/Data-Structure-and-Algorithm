package Basic_Array_Codes;

public class Avg {
  public static void main(String[] args) {
    int[] arr = {42, 7, 19, 85, 3, 61, 27, 14};

    int count = 0 ;
    int sum = 0;
    for(int i = 0 ; i<arr.length ; i++){
      sum += arr[i];
      count++;
    }
    System.out.println("Average Of all Element in array : " + sum/count);
  }
}
