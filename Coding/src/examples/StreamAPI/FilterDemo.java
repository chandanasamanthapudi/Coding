package examples.StreamAPI;

import java.util.HashMap;
import java.util.Map;

public class FilterDemo {
	
	public static void main(String[] args) {
		
		/*
		List<String> list = new ArrayList<>();
		
		list.add("Chandana");
		list.add("Saidha");
		list.add("Pallavi");
		list.add("Shiva");
		
		list
		.stream()
		.filter(t ->t.startsWith("S"))
		.forEach(t -> System.out.println(t));
	}
}
*/
//Now i want if key % 2 ==0 , for even entrySet i want result we want "Filter"\

		Map <Integer,String > map = new HashMap<>();
	     map.put(1, "java 8");
		 map.put(2, "java 9");
		 map.put(3, "java 10");
		 map.put(4, "java 11");
		 map.put(5, "java 12");
		  
			map.entrySet()
			.stream()
			.filter(k -> k.getKey() % 2 == 0)
			.forEach(t -> System.out.println(t));
	}	
}
