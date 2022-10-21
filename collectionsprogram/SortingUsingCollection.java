package collectionsprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {

		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)
		List<String> list = new ArrayList<String>();
		list.add("HCL");
		list.add("Wipro");
		list.add("Aspire System");
		list.add("CTS");

		// get the length of the array
		System.out.println("The Length of the Array is: "+list.size());
		System.out.println("                                         ");
		//System.out.println(list.get(3));
		
		// sort the array
		Collections.sort(list);
		System.out.println("The Sorting Result is: "+list);
		System.out.println("                                ");
		
		// Iterate it in the reverse order
		System.out.println("The Required Output is: ");
		for (int i = list.size() - 1; i >= 0; i--) {
			
			System.out.print(" " + list.get(i));
		}

	}
}
