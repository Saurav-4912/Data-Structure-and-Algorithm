public class Pattern11 {
  public static void main(String[] args) {
    int n = 4;

    printReverseEquilateralTriangle(n);
  }
  public static void printReverseEquilateralTriangle(int n)
	{
		            
		for(int i=n; i>=1; i--)
		{
		             
			int spaceCount = n-i;  // important Move
			 
			for(int space=1; space<= spaceCount; space++)
			{
				System.out.print(" ");
			}
			
			            
			for(int j=1; j<=i; j++)
			{
				System.out.print("* "); 
			}
			
			System.out.println();
		}
		System.out.println("-----------------------");
	}
	

}
