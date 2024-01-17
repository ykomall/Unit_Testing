package com.demotest.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryMock implements BookRepository {

	@Override
	public void save(Book book) {
		saveCalled++;
		lastBook = book;
	}

	int saveCalled=0;
	Book lastBook = null;
	
	public void verify(Book b,int times) {
		assertEquals(times,saveCalled);
	}
	
	
}
