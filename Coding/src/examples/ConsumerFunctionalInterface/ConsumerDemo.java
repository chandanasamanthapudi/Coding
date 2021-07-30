package examples.ConsumerFunctionalInterface;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*public class ConsumerDemo implements Consumer <Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Lockdown From:" +t);
		
	}
	public static void main(String[] args) {
	     new ConsumerDemo().accept(2020);
	}
}
*/

/*public class ConsumerDemo {
	
	public static void main(String[] args) {
		
		Consumer <Integer> consumer =
			                        (t) -> System.out.println("My age:"+ t);
		    consumer.accept(24);		
	}	
}
*/

// In Stream API we have For-Each Method it accepts ConsumerFunctionalInterface.

/*public class ConsumerDemo {
	public static void main(String[] args) {
		
	Consumer<Integer> consumer	= 
			   t -> System.out.println("Using Java:"+ t);
			   consumer.accept(8);
			   
			// Let me Create a list of Integer.
			 List<Integer>   list1 = Arrays.asList(11,12,13);
			 
			 // here we want to ConsumerFunctionalInterface.
			 list1.stream().forEach(consumer);		                 
	}
}
*/

 //Instead of passing reference over there pass the LambdaExpression.

public class ConsumerDemo {
	public static void main(String[] args) {
	
			// Let me Create a list of Integer.
			 List<Integer>   list1 = Arrays.asList(8,11,12,13);
			 
			 // here we want to ConsumerFunctionalInterface.
			 list1.stream().forEach( t ->
			                       System.out.println("Using Java:"+ t)
			                       );	                 
	}
}

