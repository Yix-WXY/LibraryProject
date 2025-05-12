package org.example;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("M001", "Alice");
        Librarian librarian = new Librarian("L001", "Bob");

        User[] users = { member, librarian };
        for (User user : users) {
            user.displayDetails();
        }

        Book book = new Book("B001", "Java Programming", 2020, "John");
        Magazine magazine = new Magazine("M001", "Tech Today", 2022, 12);

        member.borrow(book);
        member.borrow(magazine);

        System.out.println("\nBorrowed Items:");
        for (LibraryItem item : member.getBorrowedItems()) {
            item.displayDetails();
        }

        List<LibraryItem> inventory = new ArrayList<>();
        inventory.add(new Book("B001", "Effective Java", 2018, "Joshua Bloch"));
        inventory.add(new Magazine("M101", "National Geographic", 2022, 15));

        List<String> logs = new ArrayList<>();
        logs.add("UserA borrowed B001 on 2025-05-01");
        logs.add("UserB returned M101 on 2025-05-02");


        System.out.println("=== Inventory Loaded ===");
        for (LibraryItem item : inventory) {
            System.out.println(item);
        }

        System.out.println("\n=== Borrow Logs Loaded ===");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}