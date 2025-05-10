import org.example.Book;
import org.example.LibraryItem;
import org.example.LibraryItemComparator;
import org.example.Magazine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryItemComparatorTest {
    @Test
    public void testCompareByTitle() {
        LibraryItem book1 = new Book("B001", "Algorithms", 2020, "Allen");
        LibraryItem book2 = new Book("B002", "Data Structures", 2019, "Mark");

        LibraryItemComparator comparator = new LibraryItemComparator();
        int result = comparator.compare(book1, book2);

        int expected = "Algorithms".compareToIgnoreCase("Data Structures");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCompareByTitle2() {
        LibraryItem mag1 = new Magazine("M001", "Nature", 2018, 12);
        LibraryItem mag2 = new Magazine("M002", "Nature", 2021, 13);

        LibraryItemComparator comparator = new LibraryItemComparator();
        int result = comparator.compare(mag1, mag2);

        int expected = Integer.compare(2018, 2021);
        Assertions.assertEquals(expected, result);
    }
}
