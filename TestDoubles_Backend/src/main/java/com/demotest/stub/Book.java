package com.demotest.stub;

public class Book {

	
	private String bookid;
	private int price;
	
	public Book(String bookid, int price) {
		super();
		this.bookid = bookid;
		this.price = price;
	} 
	
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
