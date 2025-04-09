public class SmallestNumber {
  public static void main(String[] args) {
    System.out.println("Hello World ");

    int[] arr = {99, 0, 99, 100};

    int num = arr[0];
    for(int i = 1; i<arr.length ; i++){
      if(arr[i] < num){
        num = arr[i];
      }
    }

    System.out.println("Smallest Number : " + num);
  }
}
