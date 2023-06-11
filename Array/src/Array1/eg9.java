package Array1;

public class eg9 
{
	public static void main(String[] args) 
	{
	int[][] ar= {{10,20,30},{40,50,60},{70,80,90}};
	
	System.out.println(ar.length);
	
	System.out.println("\n");
	
	System.out.println("Print statement");
	
	for (int i=0; i<=2;i++)
	{
		for(int j=0;j<=2;j++)
			
			System.out.print(ar[i][j]+" "); //Print is used
		
		
	}
	
	System.out.println("\n");	
	System.out.println("Println statement");
	
	for (int i=0; i<=2;i++)
	{
		for(int j=0;j<=2;j++)
			
			System.out.println(ar[i][j]+" "); //Print is used
		
		
	}
	
	System.out.println("\n");	
	System.out.println("Println and print statement");
	
	for (int i=0; i<=2;i++)
	{
		for(int j=0;j<=2;j++)
			
			System.out.print(ar[i][j]+" "); //Print is used
		
		System.out.println();
	}
	
	
	
	
	
	
	
	}
}
