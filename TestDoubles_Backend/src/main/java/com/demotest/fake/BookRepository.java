package com.demotest.fake;

import java.util.Collection;

public interface BookRepository {

	//this method saves book into the database
	public void save(Book book);
	
	public Collection<Book> findAll();
}
