package project.first.epam.babiuk.PersonalTask;

import java.util.HashMap;

public class BooksBase {
    private static HashMap<String, Book> booksNameBase = new HashMap<>();
    private static HashMap<Long, Book> booksIdBase = new HashMap<>();

    public static void addBook(Book book) {
        booksNameBase.put(book.getName(), book);
        booksIdBase.put(book.getId(), book);
    }

    public static Book getBook(String name) {
        return booksNameBase.get(name);
    }

    public static Book getBook(long id) {
        return booksIdBase.get(id);
    }
}
