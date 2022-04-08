package week3.day2.assignment;

import java.util.ArrayList;


import java.util.List;

public class CollectionsIntersection {

	public static void main(String[] args) {
		
		
		int[] firstArray = {3,2,11,4,6,7};        // declaring and defining arrays
		int[] secondtArray = {1,2,8,4,9,7};
		
		List <Integer> firstList = new  ArrayList <Integer>();    // declaring lists
		List <Integer> secondList = new  ArrayList <Integer>();
		List <Integer> thirdList =new ArrayList <Integer>();
		
		for (Integer ele : firstArray) {
			firstList.add(ele);
		}
		System.out.println(" This is the first list "+ firstList);
		
		
		for (Integer ele1 : secondtArray) {
			secondList.add(ele1);
		}
		System.out.println(" This is the Second list "+ secondList);
		
		
		// converted array to list since declaring each element in array causes code redundancy
		
	
		for (int i=0;i<=5;i++) 
		{     // using two for loops to compare two list elements
			
			for(int j=0;j<=5;j++)
			{
			if(firstList.get(i)==secondList.get(i) ) 
			{
				thirdList.add(firstList.get(i));
				break;
				
			 }
			
			
			}
		}

		System.out.println(" The elments common in both lists are in below list: ");
		System.out.println(" " + thirdList);

   }
}


