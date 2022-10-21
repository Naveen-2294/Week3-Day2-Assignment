package collectionsprogram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// Declare a String as PayPal India
		String text = "PayPal India";
		// Convert it into a character array
		char[] ch = text.toCharArray();
		System.out.println(ch);
		// Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
		// Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupcharSet = new LinkedHashSet<Character>();
		for (Character text1 : ch) {
			if (!charSet.add(text1)) {
				dupcharSet.add(text1);
			}
		}
		// Check the dupCharSet elements and remove those in the charSet
		System.out.println(dupcharSet);
		charSet.removeAll(dupcharSet);
		System.out.println(charSet);
		// Iterate using charSet
		for (Character text2 : charSet) {
			//Check the iterator variable isn't equals to an empty space
			if (text2 != ' ') {
			//print it
				System.out.print(text2);

			}
		}

	}

}
