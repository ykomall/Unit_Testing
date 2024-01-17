package com.demotest.fake;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.demotest.fake.Book;
import com.demotest.fake.BookRepository;

public class FakeBookRep implements BookRepository {

	Map<String,Book> bookStore = new HashMap<>();
	
	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		bookStore.put(book.getBookid(), book);
		
	}

	@Override
	public Collection<Book> findAll() {
		// TODO Auto-generated method stub
		return bookStore.values();
	}

}
