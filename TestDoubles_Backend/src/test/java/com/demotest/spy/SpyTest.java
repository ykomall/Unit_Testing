package com.demotest.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SpyTest {

	@Test
	public void dempSpy() {
		BookRepositorySpy br = new BookRepositorySpy();
		BookService bs = new BookService(br);
		
		Book b1 = new Book("123",500);
		Book b2 = new Book("124",500);
		
		bs.addBook(b1);
		bs.addBook(b2);
		
		assertEquals(2, br.timesCalled());
		assertTrue(br.lastBookAd(b2));
	}
}
