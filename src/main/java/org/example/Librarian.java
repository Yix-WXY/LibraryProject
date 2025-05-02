package org.example;

import java.util.List;

public class Librarian extends User {
    public Librarian(String userId, String name) {
        super(userId, name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Librarian: " + name);
    }

    public void addItem(List<LibraryItem> inventory, LibraryItem item) {
        inventory.add(item);
    }

    public void removeItem(List<LibraryItem> inventory, LibraryItem item) {
        inventory.remove(item);
    }



}
