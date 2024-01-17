package com.demotest.fake;

public class BookService {

	private BookRepository bookrepository;
	
	public BookService(BookRepository bookrepository) {
		super();
		this.bookrepository = bookrepository;
	}

	public void addBook(Book book) {
		bookrepository.save(book);
		
	}
	
	public int bookNum() {
		return bookrepository.findAll().size();
	}

	
	
}
