package collectionsprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {

		Set<Integer> values = new LinkedHashSet<Integer>();

		values.add(1);
		values.add(5);
		values.add(3);
		values.add(6);
		values.add(22);
		values.add(3);
		values.add(9);
		values.add(10);
		values.add(2);

		System.out.println(values);
		System.out.println("**********************************");

		// convert set to list
		List<Integer> list = new ArrayList<Integer>(values);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("**********************************");
		for (Integer val : list) {
			System.out.println(val);

		}
		System.out.println("**********************************");
		int n = list.get(list.size() - 1);
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (i != list.get(j)) {
				System.out.println("The Missing Number is " + i);
			} else {
				j = j + 1;
			}

		}

	}
}