package com.demotest.dummy;

public class BookService {

	private BookRepository bookrepository;
	private EmailService emailserv;//external dependency having email interface
	
	

	public BookService(BookRepository bookrepository, EmailService emailserv) {
		super();
		this.bookrepository = bookrepository;
		this.emailserv = emailserv;
	}

	public void addBook(Book book) {
		bookrepository.save(book);
		
	}
	
	public int bookNum() {
		return bookrepository.findAll().size();
	}

	
	
}
