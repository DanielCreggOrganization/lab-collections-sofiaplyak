package ie.atu.collections;


import java.util.ArrayList;
import java.util.List;

public class CustomBook {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Zahar Berkut", 200, "Ivan Franko"));
        books.add(new Book("Kateryna", 600, "Taras Shevchenko"));
        books.add(new Book("Of mice and men", 100, "John Steinbeck"));

        System.out.println("Bookies:");
        for(Book book: books){
            System.out.println(book);
        }

        books.add(3, new Book("To Kill a Mockingbird", 150,"Harper Lee" ));
        System.out.println("\nAfter adding another book at index 3:");
        for (Book book : books) {
            System.out.println(book);
        }

        books.remove(2);
        System.out.println("\nAfter removing book at index 2:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
