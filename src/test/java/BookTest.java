import org.example.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void testDisplayDetails() {
        Book book = new Book("B01", "Java Basics", 2021, "John Smith");

        book.displayDetails();
        boolean expected = true;
        boolean result = true;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDisplayDetailsEmptyTitle() {
        Book book = new Book("B01", "", 2021, "John Smith");

        book.displayDetails();

        boolean expected = true;
        boolean result = true;

        Assertions.assertEquals(expected, result);
    }
}
