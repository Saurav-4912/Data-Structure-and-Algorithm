package LogicQuestions_40;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
  public static void main(String[] args) {
    int[] arr = {1,2,2,3,4,4};

    LinkedHashSet<Integer> L = new LinkedHashSet<>();

    for(int num : arr){
      L.add(num);
    }

    System.out.println(L);
    
  }
}
