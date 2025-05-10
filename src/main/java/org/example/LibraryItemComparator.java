package org.example;

import java.util.Comparator;

public class LibraryItemComparator implements Comparator<LibraryItem> {

    /**
     * Compares two LibraryItem objects first by title (case-insensitive),
     * then by year if titles are the same.
     * @param item1 the first LibraryItem to compare
     * @param item2 the second LibraryItem to compare
     * @return a negative integer, zero, or a positive integer as the first argument
     *         is less than, equal to, or greater than the second
     */
    @Override
    public int compare(LibraryItem item1, LibraryItem item2) {
        int titleCompare = item1.title.compareToIgnoreCase(item2.title);
        if (titleCompare != 0) return titleCompare;
        return Integer.compare(item1.year, item2.year);
    }
}
