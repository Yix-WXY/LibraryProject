package org.example;

public class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String id, String title, int year, int issueNumber) {
        super(id, title, year);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + title + ", Issue No: " + issueNumber);
    }
}
