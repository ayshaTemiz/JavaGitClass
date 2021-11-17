package com.syntax.class17;

public class Book {

	
	String author;
	int page;
	
	
	
	public Book(String author){
	this.author=author;	
	System.out.println(author+" is a famous author.");
	}
	
	
	public Book(String author,int page){
	this(author);
	this.page=page;
	System.out.println(author+"'s book has "+page+" page");
	}
	
	
	
	
}
