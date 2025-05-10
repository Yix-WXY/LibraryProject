package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member extends User implements Comparable<Member> {
    private List<LibraryItem> borrowedItems = new ArrayList<>();

    public Member(String userId, String name) {
        super(userId, name);
    }

    /**
     * allowed to borrow an item
     * @param item the item to be borrowed
     */
    public void borrow(LibraryItem item) {
        borrowedItems.add(item);
        item.borrowItem(this);
    }

    /**
     * allowed to return an item
     * @param item the item to be returned
     */
    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
        item.returnItem();
    }

    /**
     * return the count of borrowed items
     * @return the count of items
     */
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
