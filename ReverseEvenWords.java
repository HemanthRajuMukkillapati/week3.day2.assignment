package week3.day2.assignment;





public class ReverseEvenWords 
{

		public static void main(String[] args) 
		{
		//Declare the input as Follow
  		
		String inputString = "I am a software tester"; 
		
		//split the words and have it in an array
		
		String[] split = inputString.split(" ");
		
		//Traverse through each word (using loop)
		
		for (int i=0;i<=split.length-1;i++) 
		{
			
			//find the odd index within the loop (use mod operator)
			
			if(i%2!=0) 
			{
				
				//split the words and have it in an array
			char[] evenStr = split[i].toCharArray();
			String rev = "";
				
			//print the even position words in reverse order using another loop (nested loop)
			for (int j=evenStr.length-1;j>=0;j--) 
			{
					
					rev=rev+evenStr[j];
				
			}
				//print the even words(odd index)
				System.out.print(rev+" ");
			
				
			}
			else 
			{
				//print the odd words
				if(i!=split.length-1)
				{
				System.out.print(split[i]+" ");
				}
				else 
				{
					System.out.print(split[i]);
				}
			}
		
		}
	}
}
		
	
