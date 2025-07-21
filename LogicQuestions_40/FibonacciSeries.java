package LogicQuestions_40;

public class FibonacciSeries {
public static void main(String[] args) {
  /*Each number is the sum of the two preceding numbers.
    The first two numbers in the series are typically 0 and 1. */
    
   // 0,1,1,2,3,5,8,13,21,34,...
   int a = 0, b = 1;

   for(int i = 2; i<=11; i++){
    System.out.println(a);
    int c = a + b;
    a = b;
    b = c;
   }
}

 


  
}
