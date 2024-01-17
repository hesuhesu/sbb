package com.example.demo;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Book {
	private final String title;
	private final String author;
	
	public static void main(String[] args) {
		Book book = new Book("타이틀", "작가");
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
	}
}