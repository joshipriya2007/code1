package Programs;

import java.util.Scanner;

public class demotables 
{
		public static void main(String[] args) 
		{
			
			Scanner s = new
					   Scanner(System.in);
			   
			   System.out.println("Enter Num 1:");
			   int num1=s.nextInt();
			
			   System.out.println("			   	\n");
			   
			   int num2=10;
				
				int sum=0;
				
				
				for(int i=1;i<=num2;i++)
					
				{
					
					sum=sum+num1;
					
					System.out.println(sum);
					
				}
			
			
		}
}
