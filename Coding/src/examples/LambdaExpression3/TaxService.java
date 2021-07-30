package examples.LambdaExpression3;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {

	//1. make static so easy to call with class name.
	
/*	public static List<Employee> EvaluateTaxUsers() {
	
		return DataBase
				.getEmployees()
				.stream()
				.filter(emp -> emp.getSalary() > 800000)
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(EvaluateTaxUsers());

	}
}
*/		
		//2. make dynamic based on input type return TaxUser & Non-TaxUser.
		
	/*	public static List<Employee> EvaluateTaxUsers(String input){
			
			if(input.equalsIgnoreCase("tax")) {	
			return DataBase
				    .getEmployees()
				    .stream()
				    .filter(emp -> emp.getSalary()> 800000)
				    .collect(Collectors.toList());
			}
			else {
			return DataBase
					.getEmployees()
					.stream()
					.filter(emp -> emp.getSalary()< 700000)
					.collect(Collectors.toList());	
			}	
		 }
         public static void main(String[] args) {
	      System.out.println(EvaluateTaxUsers("non tax"));
  }		         
}
*/
	//3. Optimizing using ternary operation instead of ifElse.
	public static List<Employee> EvaluateTaxUser(String input){
		
		return (input.equalsIgnoreCase("tax")) 
				? DataBase.getEmployees()
					      .stream()
					      .filter(emp -> emp.getSalary()>600000)
					      .collect(Collectors.toList())
			    : DataBase.getEmployees()
                          .stream()
                          .filter(emp -> emp.getSalary()<=500000)
                          .collect(Collectors.toList());				                                    
	}
	public static void main(String[] args) {
		System.out.println(EvaluateTaxUser("tax"));
	}
}

/*In such cases we are going with STREAM-API
  whenever we're getting data from database or any Third PartyAPI.*/




