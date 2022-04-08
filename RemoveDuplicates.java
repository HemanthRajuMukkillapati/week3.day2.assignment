package week3.day2.assignment;


import java.util.LinkedHashSet;
import java.util.Set;


	public class RemoveDuplicates {

	public static void main(String[] args) {
	
	//Declaring a string	
	String text = "We learn java basics as part of java sessions in java week1";
	
	//Splitting string based on space
	String[] text1 = text.split(" ");
	
	// Declaring a Set: LinkedHashSet, becacuse its in order and removes duplicates
	Set <String> removeDuplicates = new LinkedHashSet<String>();
		
	// adding string to list
	for (String str : text1) 
	{
			
			removeDuplicates.add(str);
	}
	
	// converting an set to string
	String string1 = removeDuplicates.toString();
	
	//splitting by comma, bcz in list we have commas by default
	String[] split = string1.split(",");
	
	//print each string together to form the orginal sentence without java
	for (String string : split) 
	{
			
	System.out.print(string);
	
	}
		
	}

}
