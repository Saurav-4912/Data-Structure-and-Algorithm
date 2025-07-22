package LogicQuestions_40;

public class LargestElement {
  public static void main(String[] args) {
    int[] arr = {1,3,15,7,9};

    int maxNumber = arr[0];

    for(int i = 1; i<arr.length;i++){
      if(arr[i] > maxNumber){
        maxNumber = arr[i];
      }
    }

    System.out.println(maxNumber);
  }
}
