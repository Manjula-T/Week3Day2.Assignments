package week3.day2.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterOccurance {

	public static void main(String[] args) {


		//1. Create a String with your name as value
		String value = "Manjula";

		//2. Convert the string into a char array	
		char[] ch = value.toCharArray();

		//3. Create an empty Map<Character,Integer>
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		//4. Iterate over the array
		//5. Check whether the Map contains the Character
		//6. If it contains then increment the key (+1)
		//7. Add the character in the map & set the value as 1
		//8. Print the Map

		for (int i = 0; i < ch.length;i++) {
			if (myMap.containsKey(ch[i]))
			{
				myMap.put(ch[i], myMap.get(ch[i])+1);}

			else {
				myMap.put(ch[i], 1);

			}
			
		}
		System.out.println(myMap);
	}
	





}
