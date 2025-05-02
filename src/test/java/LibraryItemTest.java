import org.example.Book;
import org.example.LibraryItem;
import org.example.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryItemTest {
    @Test
    public void testBorrowItem() {
        LibraryItem item = new Book("B01", "Java Basics", 2021, "John Smith");
        Member member = new Member("M01", "Alice");

        item.borrowItem(member);
        boolean result = item.isBorrowed();
        boolean expected = true;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBorrowItemAlreadyBorrowed() {
        LibraryItem item = new Book("B01", "Java Basics", 2021, "John Smith");
        Member member1 = new Member("M01", "Alice");
        Member member2 = new Member("M02", "Bob");

        item.borrowItem(member1);
        item.borrowItem(member2);

        boolean result = item.isBorrowed();
        boolean expected = true;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testReturnItem() {
        LibraryItem item = new Book("B01", "Java Basics", 2021, "John Smith");
        item.borrowItem(new Member("M01", "Alice"));
        item.returnItem();
        boolean result = item.isBorrowed();
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testReturnItemAlreadyReturned() {
        LibraryItem item = new Book("B01", "Java Basics", 2021, "John Smith");
        item.returnItem();

        boolean result = item.isBorrowed();
        boolean expected = false;

        Assertions.assertEquals(expected, result);
    }
}
