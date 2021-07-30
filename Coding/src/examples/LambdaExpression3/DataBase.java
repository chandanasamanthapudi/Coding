package examples.LambdaExpression3;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	public static List<Employee> getEmployees(){
		
		List<Employee> list = new ArrayList<>();
		   list.add(new Employee( 106, "Roshan", "IT", 500000));
		   list.add(new Employee( 107, "Deelip", "Pharamacy", 700000));
		   list.add(new Employee( 108, "Sunitha", "Business", 800000));
		   list.add(new Employee( 109, "Snigdha", "sales-force", 900000));
		   list.add(new Employee( 110, "Deepthi", "Lawyer", 850000));
		   
	    	return list;	
		
	}	
}
		