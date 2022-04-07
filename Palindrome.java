package week3.day2.assignment;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String pali="madam";
		String rev="";
		
	
		
		for (int iterator=pali.length()-1; iterator>=0;iterator--) {
			
			rev=rev+pali.charAt(iterator);
		}
		System.out.println(rev);
		if(rev.equals(pali)) {
			System.out.println("Given String is a Pallindrome");
		}
		
		else {
			System.out.println("Given String is not a Pallindrome");
		}
		
		
	}

}
