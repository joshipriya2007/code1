package Array1;

public class Eg8 
{
	public static void main(String[] args) 
	{
	//     0   1   2
	// 0   10  20  30
	// 1   40  50  60
		
		int[][] ar= new
		
				int[2][3];
		
		ar[0][0]= 10;
		
		ar[0][1]= 20;
				
		ar[0][2]= 30;
		
		ar[1][0]= 40;
		
		ar[1][1]= 50;
		
		ar[1][2]= 60;
		
		
		
		
		System.out.println(ar.length);
		
		System.out.println("\n");
		
		System.out.println("PRINTLN IS USED");
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
			
			System.out.println(ar[i][j]);///// PRINTLN IS USED
			
			}
		}
	
		System.out.println("\n");
		System.out.println("PRINT IS USED");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
			
			System.out.print(ar[i][j]+" "); /////PRINT IS USED PLUS "sPACE" GIVEN
			
			}
		}
		
		System.out.println("\n");
		
		System.out.println("BOTH PRINT AND PRINTLN  IS USED");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
			
			System.out.print(ar[i][j]+" "); /////PRINT  and  PRINTLN and +" " IS USED
			
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.println("BOTH PRINTln AND PRINTLN  IS USED");
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
			
			System.out.println(ar[i][j]); /////PRINTln  and  PRINTLN IS USED
			
			}
			System.out.println();
		}
		
System.out.println("\n");
		
		
	}
}
