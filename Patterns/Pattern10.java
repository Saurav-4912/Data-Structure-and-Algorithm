public class Pattern10 {
  public static void main(String[] args) {
    int n=4;
    printEquilateralTriangle(n);
  }
  	public static void printEquilateralTriangle(int n)
	{
		            
		for(int i=1; i<=n; i++)
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
