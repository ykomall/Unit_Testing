package com.demotest.spy;

public class BookRepositorySpy implements BookRepository {

	@Override
	public void save(Book book) {
		saveCalled++;
		lastBook = book;
	}

	int saveCalled=0;
	Book lastBook = null;
	
	public int timesCalled() {
		return saveCalled;
	}
	
	public boolean lastBookAd(Book book) {
		return lastBook.equals(book);
	}
}
