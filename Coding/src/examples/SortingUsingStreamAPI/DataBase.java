package examples.SortingUsingStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	public static List<Employee> getEmployees(){
		
		List<Employee> list = new ArrayList<>();
		   list.add(new Employee( 106, "Chandana", "IT", 900000));
		   list.add(new Employee( 107, "Deelip", "Pharamacy", 100000));
		   list.add(new Employee( 108, "Sunitha", "Business", 850000));
		   list.add(new Employee( 109, "Pradajwal", "sales-force", 350000));
		   list.add(new Employee( 110, "Anusha", "Lawyer", 610000));
		   
	    	return list;	
		
	}	
}
		