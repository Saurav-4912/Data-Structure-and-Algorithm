public class Pattern8 {
  public static void main(String[] args) {
    int n = 4;

    printReverseRightAngleTriangle(n);
  }
  	public static void printReverseRightAngleTriangle(int n)
	{                
		             
		for(int i=n; i>=1; i--)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"); 
			}
			
			System.out.println();
		}
		System.out.println("-----------------------");
	}

}
