package week3.day2.assignment;



public class FindTypes 
{

	public static void main(String[] args) 
	{
		// Here is the input
	String test = "$$ Welcome to 2nd Class of Automation $$ ";

	// Here is what the count you need to find
	int  letterCount = 0, spaceCount = 0, numCount = 0, specialCharCount = 0;

	// Build the logic to find the count of each
	//Convert the String to character array
	char[] FTypes = test.toCharArray();
	
	//Traverse through each character (using loop)
	
	
	//checking using default character methods
	for (char c : FTypes) 
	{
		if(Character.isLetter(c)) 
		{
			letterCount++;
			
		}
		else if (Character.isWhitespace(c)) 
		{
			
			spaceCount++;
		}
		else if (Character.isDigit(c)) {
			
			numCount++;
		}
		else {
			
			specialCharCount++;
			
		}

		
	}
	
	//printing counts
	System.out.println("letter: " + letterCount);
	System.out.println("space: " + spaceCount);
	System.out.println("number: " + numCount);
	System.out.println("specialCharcter: " + specialCharCount);
	
		
	}
	
}