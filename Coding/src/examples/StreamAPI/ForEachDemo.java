package examples.StreamAPI;

import java.util.HashMap;
import java.util.Map;

// This ForEach() always accepts the ConsumerFunctionalInterface.
public class ForEachDemo {
	
	public static void main(String[] args) {
		
		/*List<String > list = new ArrayList<>();
		     list.add("Corejava");
		     list.add("Hibernate");
		     list.add("RestFulWebservice");
		     list.add("SpringBoot");
		     list.add("Microservice");
		     
		     for(String s : list) {
		    	System.out.println(s);
		     }
	}
}
*/
// Convert list to Stream to access pipeline methods.
  /* 
		List<String> list = new ArrayList<>();
		 list.add("Capgemini");
	     list.add("Infosys");
	     list.add("Wipro");
	     list.add("Zenser");
	     list.add("Meensat");
	    
	     list.stream().forEach(t -> System.out.println(t));
	     }	
}
*/
// Map
/*  Map<Integer,String> map = new HashMap<>();
     map.put(1, "java 8");
	 map.put(2, "java 9");
	 map.put(3, "java 10");
	 map.put(4, "java 11");
	 map.put(5, "java 12");
	 
	 map.forEach((key,value)->
	                         System.out.println("key: " + value));
	}
}
*/

//Covert into Stream to access pipeline methods.
		
		Map <Integer,String > map = new HashMap<>();
	     map.put(1, "java 8");
		 map.put(2, "java 9");
		 map.put(3, "java 10");
		 map.put(4, "java 11");
		 map.put(5, "java 12");
		 
		 map.entrySet().stream().forEach( t-> System.out.println(t));
		
	}
	
}
