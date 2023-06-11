package Array10;

public class eg9 
{
		public static void main(String[] args) 
		{
			
		int[][]ar = {{1,2,2,3},{2,3,3,4},{3,4,4,5},{4,5,5,6}};
	
		System.out.println("array length"+"\n"+ar.length);
	
		System.out.println("\n");
		
		System.out.println("Print statement");
		
		
		for (int i=0; i<=3;i++)
		{
			for(int j=0;j<=3;j++)
				
				System.out.print(ar[i][j]+" "); //Print is used
			
			
		}
		
		System.out.println("\n");
		System.out.println("Print and Println statement");
		
		for (int i=0; i<=3;i++)
		{
			{for(int j=0;j<=3;j++)
				
				System.out.print(ar[i][j]+" "); //Print is used
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
		System.out.println("Println statement");
		for (int i=0; i<=3;i++)
		{
			{for(int j=0;j<=3;j++)
				
				System.out.println(ar[i][j]+" "); //Print is used
			}
			
		
		}
		
		
		System.out.println("\n");
		System.out.println("Println and println statement");
		for (int i=0; i<=3;i++)
		{
			{for(int j=0;j<=3;j++)
				
				System.out.println(ar[i][j]+" "); //Print is used
			}
			
			System.out.println();
		}
		
		
		
		}	
}
