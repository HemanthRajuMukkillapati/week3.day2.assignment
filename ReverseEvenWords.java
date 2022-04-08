package week3.day2.assignment;

public class ReverseEvenWords 
{

	public static void main(String[] args) 
	{
		//Declare the input as Follow
  		
		String inputString = "I am a software tester"; 
		
		//split the words and have it in an array
		String[] afterSplit=inputString.split(" ");
		
		String temp="";
		
		
		
		//Traverse through each word (using loop)
		for (int i=0;i<afterSplit.length; i++) 
		{
			
			if(i%2==1) 
			{
				temp =temp+" "+afterSplit[i];
				
			}
			
		}
		System.out.println(temp);
		
		String [] tempSplit = temp.split(" ");
		
		for (String ele : tempSplit) {
			
			System.out.println(ele);
			
			
		}
		
		

	}

}
