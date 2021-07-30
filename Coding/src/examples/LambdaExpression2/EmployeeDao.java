package examples.LambdaExpression2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
  public List<Employee> getEmployees() {
  
      List<Employee> employees = new ArrayList<>();
      employees.add(new Employee("Zomota", 101, 218567.00));
      employees.add(new Employee("Swiggy", 102, 328567.00));
      employees.add(new Employee("Go-Daddy", 103, 458567.00));
      employees.add(new Employee("Just-Dial", 104, 568567.00));
      return employees;
  }
      
}
