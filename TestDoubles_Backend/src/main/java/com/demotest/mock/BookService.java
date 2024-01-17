package com.demotest.mock;

public class BookService {

	private BookRepository bookrepository;
	
	public BookService(BookRepository bookrepository) {
		super();
		this.bookrepository = bookrepository;
	}

	public void addBook(Book book) {
		
		if(book.getPrice()>400) {
			return;
		}
		bookrepository.save(book);
		
	}
	
	
}
