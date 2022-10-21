package collectionsprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7,10,13};
		Set<Integer> empty = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			empty.add(data[i]);
		}
		System.out.println(empty);
		List<Integer> Result = new ArrayList<Integer>(empty);
		System.out.println("The Second Largest Number is " + Result.get(Result.size()-2));
	}

}
