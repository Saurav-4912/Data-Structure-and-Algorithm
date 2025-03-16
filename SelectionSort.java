import java.util.Arrays;

public class SelectionSort {

  public static void selectionSort(int[] arr){
    int n = arr.length;
		
		for(int i = 0 ; i<n ; i++) 
		{
			for(int j = i+1 ; j<n ; j++) 
			{
				if(arr[i]>arr[j]) 
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
  }
  public static void main(String[] args) {
    int[] arr = { 94, 125, 6, 39, 10 };
		//int[] arr = {55,44,33,22,11};
		//int[] arr = {11,22,33,44,55};
		
		System.out.println("Before Sort : " + Arrays.toString(arr));
		
		SelectionSort.selectionSort(arr);
		
		System.out.println("After Sort : " + Arrays.toString(arr));
  }
}
