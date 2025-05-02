package org.example;

public class Book extends LibraryItem {
    private String author;

    public Book(String id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}
