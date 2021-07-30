package examples.LambdaExpression2;

import java.util.Collections;
import java.util.Comparator;
//import java.util.Comparator;
import java.util.List;

public class EmployeeService {
	
	public List<Employee> getEmployeesinSort(){
		
		List<Employee> employees= new EmployeeDao().getEmployees();
		Collections.sort(employees,new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}			
	     });
		return employees;
    }
	public static void main(String[] args) {
		System.out.println(new EmployeeService().getEmployeesinSort());
	}
	
/* class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getName().compareTo(o2.getName());
	}
 }

*/
	
       /* public List<Employee> getEmployeesinSort(){
		
		List<Employee> employees= new EmployeeDao().getEmployees();
		Collections.sort(employees,
				                   (o1,o2)->
		                            o1.getName().compareTo(o2.getName())
		                            );
		return employees;               
        }
    public static void main(String[] args) {
    System.out.println(new EmployeeService().getEmployeesinSort());
        }   
         */ 
	
	/*public static void main(String[] args) {

		List<Employee> list=Arrays.asList(
		new Employee("Kishore", 101,453568.556),
		new Employee("Chandana", 102,488486.69),
		new Employee("Snigdha", 103, 85456.5),
		new Employee("Pallavi", 104, 69469.5),
		new Employee("Baba", 105, 76898.58),
		new Employee("Renuka", 106, 96485.84)
		);
		List sortedObjects=
				(List) list.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());


		System.out.println(sortedObjects);
		}
   
	*/
}	