package com.demotest.stub;

import java.util.List;

public class BookService {

	private BookRepository bookrepository;
	
	

	public BookService(BookRepository bookrepository) {
		super();
		this.bookrepository = bookrepository;
		
	}

	public List<Book> bookWtDiscount(int disc,int day){
		List<Book> newBook = bookrepository.findNewBook(day);
		
		for(Book b : newBook) {
			int price = b.getPrice();
			int newPrice = price-(disc*price/100);
			b.setPrice(newPrice);
			
		}
		
		return newBook;
	}

	
	
}
