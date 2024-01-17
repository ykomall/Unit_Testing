package com.demotest.stub;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StubTest {

	@Test
	public void demoTest() {
		BookRepository br = new BookRepositoryStub();
		BookService bs = new BookService(br);
		
		List<Book> newBookWtDisc= bs.bookWtDiscount(10, 7);
		
		assertEquals(2,newBookWtDisc.size());
			assertEquals(450,newBookWtDisc.get(0).getPrice());
			assertEquals(360,newBookWtDisc.get(1).getPrice());
	}
}
