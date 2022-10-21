package week3.day2;

import java.aw;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(54);
		list.add(67);
		list.add(55);
		list.add(66);
		list.add(42);
		list.add(27);
		list.add(89);

		for (Integer i : list) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		List<String> list1 = new ArrayList<String>();
		list1.add("Arun");
		list1.add("Deepa");
		list1.add("Maria");
		list1.add("Deepa");
		list1.add("Sharmila");
		list1.add("Muthu");
		list1.add("Chandru");

		for (String M : list1) {
			boolean Mletter = M.startsWith("M");
			if (Mletter == true) {
				System.out.println(M);
			}

		}
	}
}
