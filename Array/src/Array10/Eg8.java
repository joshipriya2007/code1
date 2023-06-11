package Array10;

public class Eg8 
{
	public static void main(String[] args) 
	{
		
	
		int[][] ar=new
				int[4][4];
		
		
		//      0   1   2    3
		//  0   10  11  12   12
		//  1   11  12  13   14
		//  2   12  13  14   15
		//  3   13  14  15   16
		
		
		ar [0][0] = 10;
		ar [0][1] = 11;
		ar [0][2] = 12;
		ar [0][3] = 12;
		ar [1][0] = 11;
		ar [1][1] = 12;
		ar [1][2] = 13;
		ar [1][3] = 14;
		ar [2][0] = 12;
		ar [2][1] = 13;
		ar [2][2] = 14;
		ar [2][3] = 15;
		ar [3][0] = 13;
		ar [3][1] = 14;
		ar [3][2] = 15;
		ar [3][3] = 16;
		
		System.out.println(ar.length);
		
		System.out.println("-----------");
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
				
				{		
					System.out.print(ar[i][j]+" ");
				}
			
			System.out.println();
		
		}
		System.out.println("-----------");
		
		
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
				
				{		
					System.out.println(ar[i][j]+" ");
				}
			
			
		}
		System.out.println("-----------");
		

		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
				
				{		
					System.out.print(ar[i][j]+" ");
				}
			
			
		}
		System.out.println("\n");
		System.out.println("-----------");
		
		
		
		
	}		
}
