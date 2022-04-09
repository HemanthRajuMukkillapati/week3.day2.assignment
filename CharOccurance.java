package week3.day2.assignment;


public class CharOccurance 
{

	public static void main(String[] args) 
	{
		
		// Check number of occurrences of a char (eg 'e') in a String
		
		//declare a String
		String str = "welcome to chennai";
		
		//intialize an counter
		int count=0;
		
		//converting string to char
		char[] chArr=str.toCharArray();
		
		
		//loop to verify each character=e or not
		for (int i = 0;i<=chArr.length-1;i++) 
		{
			if(chArr[i]=='e') 
			{
				count=count+1;
			}
			
		}
		//print counter=occurence of e
		System.out.println("The occurence of e is : "+ count);

	}

}
