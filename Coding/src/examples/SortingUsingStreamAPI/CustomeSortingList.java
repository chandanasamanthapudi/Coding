package examples.SortingUsingStreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomeSortingList {
	
public static void main(String[] args) { 
	
	/*List<Integer> list = new ArrayList<>();
	              list.add(900);
	              list.add(500);
	              list.add(300);
	              list.add(5400);
	              list.add(890);
	              
	  List<Employee> employees = DataBase.getEmployees();
	  Collections.sort(employees,new MyComparator());
	  System.out.println(employees);                          
      }
}
class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	//	return (int) (o1.getSalary()-o2.getSalary());
	//	return (o1.getName().compareTo(o2.getName()));
	//	return (o1.getId()- o2.getId());
		return (o1.getDept().compareTo(o2.getDept()));
	    }
	
	//For Descening Orders
	 // 1. return (int) (o2.getSalary()-o1.getSalary());
	 // 2. return (o2.getName().compareTo(o1.getName()));
	 // 3. return (o2.getId()- o1.getId());
	 // 4. return (o2.getDept().compareTo(o1.getDept()));
    }
    */
	
	
	// 2.Instead of passing MyComparator pass the Comparator with Anonymous method.
	/*List<Integer> list = new ArrayList<>();
				  list.add(900);
                  list.add(500);
                  list.add(300);
                  list.add(5400);
                  list.add(890);
     List<Employee> employees = DataBase.getEmployees();
     Collections.sort(employees ,new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getDept().compareTo(o2.getDept()));
		//  return (int) (o2.getDept().compareTo(o1.getDept()));
		}
     });
     System.out.println(employees);
    }
}
*/
	
	//3. Comparator is a FunctionalInterface,so We can go with LambdaExpression.
	/*    List<Integer> list = new ArrayList<>();
	              list.add(900);
                  list.add(500);
                  list.add(300);
                  list.add(5400);
                  list.add(890);
          List<Employee> employees = DataBase.getEmployees();
          Collections.sort(employees ,(o1,o2)-> 
                                              (int)(o1.getSalary()-o2.getSalary())
                                              );
          System.out.println(employees);
          
 */
	//4. Optimize the Lambda Expression with StreamAPI using method reference.
   /* List<Integer> list = new ArrayList<>();
                  list.add(900);
                  list.add(500);
                  list.add(300);
                  list.add(5400);
                  list.add(890);
    List<Employee> employees = DataBase.getEmployees();

	employees
	.stream()
	.sorted((o1,o2)-> (int)(o1.getSalary()-o2.getSalary()))
	.forEach(System.out::println);
	*/
	
	//5.Optimize The Lambda Expression By passing Method reference.
	
	/*List<Integer> list = new ArrayList<>();
                  list.add(900);
                  list.add(500);
                  list.add(300);
                  list.add(5400);
                  list.add(890);
    List<Employee> employees = DataBase.getEmployees();
    
    employees
    .stream()
    .sorted(Comparator.comparing(emp -> emp.getName()))
    .forEach(System.out::println);
	
	*/
	//6. Remove LambdaExpression Use MethodReference.
	List<Integer> list = new ArrayList<>();
                  list.add(900);
                  list.add(500);
                  list.add(300);
                  list.add(5400);
                  list.add(890);
    List<Employee> employees = DataBase.getEmployees();
    
    employees
    .stream()
    .sorted(Comparator.comparing(Employee::getSalary))
    .forEach(System.out::println);	
   }
}


