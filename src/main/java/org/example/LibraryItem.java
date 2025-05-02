package org.example;

public abstract class LibraryItem implements Borrowable {
    protected String id;
    protected String title;
    protected int year;
    protected boolean isBorrowed;

    public LibraryItem(String id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.isBorrowed = false;
    }

    public abstract void displayDetails();

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowItem(Member member) {
        this.isBorrowed = true;
    }

    public void returnItem() {
        this.isBorrowed = false;
    }
}
