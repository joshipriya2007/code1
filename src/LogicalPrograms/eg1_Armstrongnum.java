package LogicalPrograms;

import java.util.Scanner;

public class eg1_Armstrongnum 
{
	public static void main(String[] args) 
	{
		Scanner s=new
				
				Scanner(System.in);
		
		int OrgNum=s.nextInt();
		
		
		
		
	
		
		int sum=0;
		
		for(int i=OrgNum; i>0;i=i/10)
		
		{
			
			
			int rem=i%10;
			
			sum=sum+(rem*rem*rem);
		
			
			
			
		}
		
		
		if (OrgNum==sum)
		
		{
			
		
		System.out.println("given no is armstrong number");
		
		
		}
		
			
		else
			
		{
			
		
		System.out.println("given no is not armstrong number");
		
		
		}
		
			
		
	}
		
		
		
	
	
	
}
