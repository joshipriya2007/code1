package Programs;

public class eg4_ReverseString 
{
		public static void main(String[] args) 
		{
			String org="abcd";
			
			String rev="";
			
			for(int i=org.length()-1;i>=0;i--)
				
			{
				
				rev= rev+org.charAt(i);
				
							
			}
			
			
			System.out.println(org);
			
			System.out.println("\n");
			
			System.out.println(rev);
			
			
		}
}
