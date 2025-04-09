package Basic_Array_Codes;

public class LargestNumber {
  public static void main(String[] args) {
    int[] arr = {-3, -5, -1, -10};

    int largestNumber = arr[0];
    for(int i = 1 ; i < arr.length ; i++){
      if(arr[i] > largestNumber){
        largestNumber = arr[i];
      }
    }

    System.out.println("Largest Number : " + largestNumber);
  }
}
