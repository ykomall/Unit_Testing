package com.demotest.stub;

import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements BookRepository {

	
	@Override
	public List<Book> findNewBook(int day) {
	List<Book> newBook = new ArrayList<>();
	Book b1 = new Book("1235",500);
	Book b2 = new Book("1234",400);
	
	newBook.add(b1);
	newBook.add(b2);
		
		return newBook;
	}
}
