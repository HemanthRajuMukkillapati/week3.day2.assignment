package week3.day2.assignment;



import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] array = {3,2,11,4,6,7};
		
		Set <Integer> treeSet = new  TreeSet <Integer>(); 
		
		
		for (Integer integer : array) 
		{
			treeSet.add(integer);
		}
		
		//converting into treeset makes array in order as TreeSet follows asiic order
		
		
		System.out.println(treeSet);
		
		Object[] array2 = treeSet.toArray();
		
		//since we cant retirve value from TreeSet converting back to array
		
		int Secondlargest=(int) array2[array2.length-2];
		//type casting object type to int 
		

		
		System.out.println("the second largest number in the list is:  " + Secondlargest);
		

		
	}
}
