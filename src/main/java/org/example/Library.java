package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    /**
     * search books by its title
     * @param title the searched title
     * @return list of books with the title
     */
    public List<LibraryItem> searchByTitle(String title) {
        return items.stream()
                .filter(i -> i.title.toLowerCase().contains(title.toLowerCase()))
                .toList();
    }

}
