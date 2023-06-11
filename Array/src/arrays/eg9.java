package arrays;

public class eg9 


{
	public static void main(String[] args) 
	{
		int[][]ar= {{10,20,30},{40,50,60}};
		
			
	System.out.println(ar[1][1]);
	System.out.println(ar.length);
	
	System.out.println("\n");
	
	for(int i=0; i<=1;i++)
	{
		for(int j=0; j<=2;j++)
		{
			System.out.print(ar[i][j]+" ");
		}
			
			System.out.println();
	}
	
	System.out.println("\n");
	
	for(int i=0; i<=1;i++)
	{
		for(int j=0; j<=2;j++)
		{
			
			System.out.print(ar[i][j]+" ");
		}
			
		
	}
	
	System.out.println("\n");
	
	for(int i=0; i<=1;i++)
	{
		for(int j=0; j<=2;j++)
		{
			System.out.println(ar[i][j]+" ");
		}
			
	
	}
	}

}
