package LogicQuestions_40;

public class FibonacciSeries {
public static void main(String[] args) {
  
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
