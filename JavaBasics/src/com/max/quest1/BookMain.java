package com.max.quest1;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book("Master Book", "test",1000,"Non fiction");
		book.getDetails();
		book.checkBookType();
	}
}
