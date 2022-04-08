package week3.day2.assignment;

public class Palindrome {
	
	public static void main(String[] args) {
		
		
		// declaring an string to check Palindrome or not and an empty string to print reverse
		String stringtoverify="madam";
		
		String rev="";
		
		
		for (int iterator=stringtoverify.length()-1; iterator>=0;iterator--) {
			
			rev=rev+stringtoverify.charAt(iterator);
		}
		
		//Printing reverse of string
		System.out.println(rev);
		
		//verifying reverse of string is equal to actual string or not
		if(rev.equals(stringtoverify)) 
		{
			System.out.println("Given String is a Pallindrome");
		}
		
		else 
		{
			System.out.println("Given String is not a Pallindrome");
		}
		
		
	}

}
