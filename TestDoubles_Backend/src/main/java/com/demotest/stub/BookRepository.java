package com.demotest.stub;

//import java.util.Collection;
import java.util.List;

public interface BookRepository {

	List<Book> findNewBook(int day);

	
}
