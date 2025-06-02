public class Pattern12 {
  public static void main(String[] args) {
    int n = 4;

    printDiamod(n);
  }
  	public static void printDiamod(int n)
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
    	
		for(int i=n-1; i>=1; i--)
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
	
		//printEquilateralTriangle(n);
		//printReverseEquilateralTriangle(n-1);
		
	}//method

  }
