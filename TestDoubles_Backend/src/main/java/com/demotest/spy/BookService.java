package com.demotest.spy;

public class BookService {

	private BookRepository bookrepository;
	
	public BookService(BookRepository bookrepository) {
		super();
		this.bookrepository = bookrepository;
	}

	public void addBook(Book book) {
		bookrepository.save(book);
		
	}
	
	
}
