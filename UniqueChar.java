import java.lang.reflect.Array;
import java.util.*;

public class UniqueChar {

		/* part1: implement an algorithm to determine if a string has all unique
		 characters. What if you can not use additional data structures? 
		3 methods implemented to solve this problems with different complexity. */

	
	//O(n^2) complexity
	public static boolean uniqueChar(String s) {

		for (int i = 0; i <= s.length() - 1; i++) {
			for (int j = i + 1; j <= s.length() - 1; j++) {
				if (s.charAt(i) == s.charAt(j))
					return false;
			}
		}
		return true;
	}
	// What if you can not use additional data structures? (nLogn) complexity

	public static boolean uniqueCharAscii(String s) {
		/*
		 * Convert the string to character array for sorting
		 */
		char[] charArray = s.toLowerCase().toCharArray();
		Arrays.sort(charArray);
		// check each char to the char next to it
		for (int i = 0; i < s.length() - 1; i++) {
			if (charArray[i] != charArray[i + 1])
				continue;
			else
				return false;
		}
		return true;
	}

//O(n) complexity 
	public static boolean uniqueChar256(String s) {
		// put all the 256 bit to false
		boolean[] charArray = new boolean[256];
		for (int i = 0 ; i< 256 ; i++){
			charArray[i] = false; 
		}
		
		//getting the ASCII number for each char in our string 
		for (int i = 0; i <= s.length()-1; i++) {
			int index = (int) s.charAt(i);
			
			 /* If the value is already there, return false */
	      
			if (charArray[index] == true)
				return false;

			charArray[index] = true;

		}
		return true;
	}

	
}
