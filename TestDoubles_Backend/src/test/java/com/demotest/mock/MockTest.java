package com.demotest.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MockTest {

	@Test
	public void dempSpy() {
		BookRepositoryMock br = new BookRepositoryMock();
		BookService bs = new BookService(br);
		
		Book b1 = new Book("123",500);
		Book b2 = new Book("124",400);
		
		bs.addBook(b1);//return
		bs.addBook(b2);//save called
		
		br.verify(b2, 1);
	}
}
