import org.example.Book;
import org.example.Library;
import org.example.LibraryItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    @Test
    public void testSearchByTitle1() {
        Library library = new Library();
        LibraryItem book = new Book("B1", "Java Programming", 2020, "Author A");
        library.addItem(book);

        List<LibraryItem> result = library.searchByTitle("Java Programming");
        List<LibraryItem> expected = new ArrayList<>();
        expected.add(book);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSearchByTitle2() {
        Library library = new Library();
        library.addItem(new Book("B2", "Algorithms", 2021, "Author B"));

        List<LibraryItem> result = library.searchByTitle("Nonexistent");
        List<LibraryItem> expected = new ArrayList<>();

        Assertions.assertEquals(expected, result);
    }
}
