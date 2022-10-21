package collectionsprogram;

import java.util.Arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {
	public static void main(String[] args) {
		// se the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split(" ");
		String text2 = Arrays.toString(text1);
		System.out.println(text2);
		System.out.println("********************");
		Set<String> assign = new LinkedHashSet<String>();
		for (int i = 0; i < text1.length; i++) {

			assign.add(text1[i]);
		}

		//System.out.println(assign);

	for (String as:assign) {
		System.out.print(as+" ");
	}
}
}