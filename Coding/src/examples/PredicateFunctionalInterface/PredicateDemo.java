package examples.PredicateFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*public class PredicateDemo implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		if(t % 2 == 0) {
			return true;
		}
		else{
			return false;
		}
	}
public static void main(String[] args) {
	System.out.println(new PredicateDemo().test(5));	
 }
}
*/
/*public class PredicateDemo {
	public static void main(String[] args) {
		/*   Predicate<Integer> predicate = (t)-> 
		                                     {
		                                      if(t % 2 == 0) {
			                                      return true;
		                                      }
		                                      else{
			                                  return false;
		                                      }
		                                  };
		      System.out.println(predicate.test(8));	                           
		   }
}
*/
		
/*      Predicate<Integer> predicate = (t)-> t % 2 == 0 ;
		System.out.println(predicate.test(7));
	}
}
*/
public class PredicateDemo {
	public static void main(String[] args) {
		
		Predicate<Integer> predicate = (t)-> t % 2 == 0 ;
		System.out.println(predicate.test(8));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
		list.stream().filter(predicate).forEach
		                                (t -> 
		                                System.out.println("print Even :"+ t));
	}		
}

				              
