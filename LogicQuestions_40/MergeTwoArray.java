package LogicQuestions_40;

public class MergeTwoArray {
  public static void main(String[] args) {
    int[] arr1 = {1,3,5};
    int[] arr2 = {2,4,6};

    int[] arr3 = new int[arr1.length + arr2.length];

    for(int i = 0; i<=arr1.length-1;i++){
      for(int j = 0; j<arr3.length;j++){
        arr3[j] = arr1[i];
      }
    }
    // for(int i = 0; i<=arr2.length-1;i++){
    //   for(int j = arr1.length+1; j<arr3.length;j++){
    //     arr3[j] = arr1[i];
    //   }
    // }

    for(int k=0; k<arr3.length;k++){
      System.out.println(arr3[k]);
    }
  }
}
