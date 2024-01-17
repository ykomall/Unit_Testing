package com.demotest.dummy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DummyTest {

	@Test
	public void demoDummy() {
		BookRepository bp = new FakeBookRep();
		EmailService emSer = new DummyEmailService();
		BookService bs = new BookService(bp,emSer);
		
		bs.addBook(new Book("123",125));
		bs.addBook(new Book("124",126));
		
		assertEquals(2,bs.bookNum());
	}
}
