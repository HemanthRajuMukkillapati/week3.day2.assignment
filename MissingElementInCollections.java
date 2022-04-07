package week3.day2.assignment;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class MissingElementInCollections {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		List <Integer> sortList = new ArrayList <Integer>();
		
		for (Integer ele : arr) {
			sortList.add(ele);
			
			
		}
		Collections.sort(sortList);
		System.out.println(sortList);
		int count=1;
		
		for (Integer listele : sortList) {
			
			if (listele==count)
			{
				count++;
			
			}
			else {
			
			System.out.println("The missing elment is: "+ count);
			break;
			
		}
		
			
	}

}}
