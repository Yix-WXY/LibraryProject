package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member extends User implements Comparable<Member> {
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public Member(String userId, String name) {
        super(userId, name);
    }

    public void borrow(LibraryItem item) {
        borrowedItems.add(item);
        item.borrowItem(this);
    }

    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
        item.returnItem();
    }

    public int getBorrowedItemCount() {
        return borrowedItems.size();
    }

    @Override
    public void displayDetails() {
        System.out.println("Member: " + name);
    }

    @Override
    public int compareTo(Member o) {
        return this.borrowedItems.size() - o.borrowedItems.size();
    }
}
