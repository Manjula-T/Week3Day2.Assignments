package week3.day2.assignments;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
//		Declare a String as PayPal India
		
		String company = "PayPal India";

//		Convert it into a character array
		char[] ch = company.toCharArray();
		
//		Declare a Set as charSet for Character
		Set<Character> setCh = new HashSet<Character>();
		
//		Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new HashSet<Character>();

//		Iterate character array and add it into charSet
		
		  for (int i = 0;i< ch.length;i++) {
			  if(setCh.add(ch[i])) {
		  
		  } System.out.println(ch[i]); }
		 

//		if the character is already in the charSet then, add it to the dupCharSet
		for (int i = 0;i< ch.length;i++)
		{
			if(!dupCharSet.add(ch[i])) {
				System.out.println("The duplicate" + ch[i]);
	
			}
					
		
		
		}


	}

}
