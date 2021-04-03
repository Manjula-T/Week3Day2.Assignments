package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class SortingUsingCollections {

	public static void main(String[] args) {



		//		Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};

		//		get the length of the array		
		int length = input.length;
		System.out.println(length);

		//		sort the array		
		List<String> all = new ArrayList<String> ();
		all.add("HCL");
		all.add("Wipro");
		all.add("Aspire Systems");
		all.add("CTS");
		Collections.sort(all);

		System.out.println("The sorted list:" +all);

		//		Iterate it in the reverse order
		List<String> list = Arrays.asList("Aspire Systems","CTS","HCL","Wipro");
		ListIterator<String> itr = list.listIterator(list.size());

		//		print the array
		while(itr.hasPrevious()) {
		String previous = itr.previous();
		
		System.out.print( previous + "," +" ");
	}
		System.out.print("In reverse Order");
	}
}
