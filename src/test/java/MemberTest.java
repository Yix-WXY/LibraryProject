import org.example.Book;
import org.example.LibraryItem;
import org.example.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    @Test
    public void testBorrow() {
        Member member = new Member("M01", "Alice");
        LibraryItem book = new Book("B01", "Java Basics", 2021, "John Smith");

        member.borrow(book);
        int result = member.getBorrowedItemCount();
        int expected = 1;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testBorrowAlreadyBorrowed() {
        Member member = new Member("M01", "Alice");
        LibraryItem book = new Book("B01", "Java Basics", 2021, "John Smith");

        member.borrow(book);
        member.borrow(book);

        int result = member.getBorrowedItemCount();
        int expected = 1;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testReturnItem() {
        Member member = new Member("M01", "Alice");
        LibraryItem book = new Book("B01", "Java Basics", 2021, "John Smith");

        member.borrow(book);
        member.returnItem(book);
        int result = member.getBorrowedItemCount();
        int expected = 0;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testReturnItemNotBorrowed() {
        Member member = new Member("M01", "Alice");
        LibraryItem book = new Book("B01", "Java Basics", 2021, "John Smith");

        member.returnItem(book);
        int result = member.getBorrowedItemCount();
        int expected = 0;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCompareTo() {
        Member member1 = new Member("M01", "Alice");
        Member member2 = new Member("M02", "Bob");

        LibraryItem book1 = new Book("B01", "Java Basics", 2021, "John Smith");
        LibraryItem book2 = new Book("B02", "Advanced Java", 2022, "Jane Doe");

        member1.borrow(book1);
        member2.borrow(book2);

        int result = member1.compareTo(member2);
        int expected = -1;

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCompareToEqualItems() {
        Member member1 = new Member("M01", "Alice");
        Member member2 = new Member("M02", "Bob");

        LibraryItem book = new Book("B01", "Java Basics", 2021, "John Smith");

        member1.borrow(book);
        member2.borrow(book);

        int result = member1.compareTo(member2);
        int expected = 0;

        Assertions.assertEquals(expected, result);
    }
}
