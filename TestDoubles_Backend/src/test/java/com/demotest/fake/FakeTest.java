package com.demotest.fake;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.demotest.fake.Book;
import com.demotest.fake.BookRepository;
import com.demotest.fake.BookService;

public class FakeTest {

	@Test
	public void testFake() {
		BookRepository bookRepo = new FakeBookRep();
		BookService bs = new BookService(bookRepo);
		
		bs.addBook(new Book("123",100));
		bs.addBook(new Book("124",150));
		
		assertEquals(2,bs.bookNum());
	}
}