public class Pattern7 {
  public static void main(String[] args) {
    
    int n = 4;
    printSquare(n);
  }
  	public static void printSquare(int n)
	{
		for(int i=1; i<=n; i++)
		{ 
			
			for(int j=1; j<=n; j++)
			{
				System.out.print("*"); 
			}
			
			System.out.println();
		}
		System.out.println("-----------------------");
	}

}
