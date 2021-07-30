package examples;

public class ClassNotFoundExceprtion {
	
	public static void main(String[] args) throws ClassNotFoundException {
		// class.forName
		
		Class.forName("com.mysql.jdbc.Driver");
		
	}

}
