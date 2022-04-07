package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInCollections {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		
		List <Integer> listitems = new  LinkedList <Integer>();// just used linked list since its not used earlier
		
		
		for (int ele : arr) {
			listitems.add(ele);
		}
//sorting list 		
		Collections.sort(listitems);
		
		int sizeofList=listitems.size();
		System.out.println(listitems);
		
		Set <Integer> avoidDuplicateSet = new TreeSet<Integer> (); 
		//declaring set to pick the values at end and avoid duplicates
		
		int count; 
		
		for (int i=0;i<sizeofList-1;i++)    //outer loop starts from zero to list list size-1
		{
			count=0;
		for (int j=1;j<sizeofList;j++)     //inner loop starts from 1 to list list size-1
		{
		
			if(listitems.get(i)==listitems.get(j))   //each element is compared to its immediate next elements 
			{
				count++;
			}
				if(count>1) 
				{
					avoidDuplicateSet.add(listitems.get(i));      //duplicate values adding to set
					
					
				}	
				
		}
		
		}
						
		
		System.out.println("The duplicate items are: "+ avoidDuplicateSet );   //printing duplicate values
	}}


	































