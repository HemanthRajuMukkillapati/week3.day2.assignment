package week3.day2.assignment;

import java.util.Arrays;

public class Anagram 
{

	public static void main(String[] args) 
	{
	
	
		
	//declaring two strings
	
		String text1 = "stops";
		String text2 = "potss";
	
	if(text1.length()==text2.length()) 
	{
		
		char[] ch1 = text1.toLowerCase().toCharArray();
		
		char[] ch2= text2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) 
		{
			
			System.out.println(text1 + " and " + text2 + " are anagrams");
			
		}
		else 
		{
			System.out.println(text1 + " and " + text2 + " are not anagrams,this is from inner else ");
		}
		
		
	}
	else
		System.out.println(text1 + " and " + text2 + " are not anagrams");

	}
}