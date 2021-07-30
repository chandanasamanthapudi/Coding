package examples.SupplierFunctionalInterface;

import java.util.Arrays;
import java.util.List;

/*public class SupplierDemo {
	public static void main(String[] args) {
		
		Supplier<String> supplier = 
				                   () -> "JAVA - 8 STREAM API";
				                   
				                  // System.out.println(supplier.get());
				                   
	//1. create list of Integer
    List<String> list1 = Arrays.asList();
                  list1.stream().findAny().orElseGet(supplier);
                  System.out.println(supplier.get());
	}		
}
*/

// Instead of passing reference use LambdaExpression.
public class SupplierDemo {
	public static void main(String[] args) {
				                   
	//1. create list of Integer
    List<String> list1 = Arrays.asList();
    System.out.println(list1.
    		           stream().
    		           findAny().
    		           orElseGet(
    		                     ()->" Hello To New Coding "));
	}		
}




