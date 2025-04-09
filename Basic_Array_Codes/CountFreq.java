package Basic_Array_Codes;

public class CountFreq {
  public static void main(String[] args) {
    int[] arr = {4, 2, 4, 3, 2, 5, 3, 3, 4, 5, 2, 1};

    int num = 4;
    int count = 0;

    for(int i =0 ; i<arr.length ; i++){
      if(arr[i] == num){
        count++;
      }
    }
    System.out.println("Count frequency : " + count);
  }
}
