public class Pattern6 {
  public static void main(String[] args) {

    int n = 4;
    printRightAngleTriangle(n);
  }

  
	public static void printRightAngleTriangle(int n)
	{
		for(int i=1; i<=n; i++)
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
