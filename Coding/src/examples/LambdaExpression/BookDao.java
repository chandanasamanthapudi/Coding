package examples.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	public List<Book> getBooks(){
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book(100, "Lenovo", 200));
		books.add(new Book(101, "Acer", 300));
		books.add(new Book(102, "Dell", 400));
		books.add(new Book(103, "HP", 100));
		
		return books;
		
		
		
	}

}
