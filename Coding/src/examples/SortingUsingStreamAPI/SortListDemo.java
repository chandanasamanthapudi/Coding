package examples.SortingUsingStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		              list.add(900);
		              list.add(500);
		              list.add(300);
		              list.add(5400);
		              list.add(890);
		              
		       /*   Collections.sort(list);    // Ascending Order
		          Collections.reverse(list); // Descending Order
		           System.out.println(list);
		           */
		      	              
		 // 1.Using Stream API sort this List
	
		list.stream()
		.sorted()
		//.sorted(Comparator.reverseOrder())
		.forEach(s->
		            System.out.println(s));		           
	}
}
        // 2.