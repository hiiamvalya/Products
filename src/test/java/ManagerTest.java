
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ManagerTest {

    @Test
    public void testBook() {
        Book book1 = new Book(5, "Soul", 500, "Levi");
        Book book2 = new Book(7, "Stars", 500, "Dias");
        Smartphone smartphone1 = new Smartphone(8, "Iphone 12", 75000, "Apple");
        Smartphone smartphone2 = new Smartphone(9, "Iphone 11", 55000, "Apple");

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Soul");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSmartphone() {
        Book book1 = new Book(5, "Soul", 500, "Levi");
        Book book2 = new Book(7, "Stars", 500, "Dias");
        Smartphone smartphone1 = new Smartphone(8, "Iphone 12", 75000, "Apple");
        Smartphone smartphone2 = new Smartphone(9, "Iphone 11", 55000, "Apple");

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = {smartphone1, smartphone2};

        Assertions.assertArrayEquals(expected, actual);
    }
}
