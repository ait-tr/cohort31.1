package books.dao;

import books.model.Book;

public interface Library {
    boolean addBook(Book book);
    Book removeBook(long isbn);
    Book findBookByIsbn(long isbn);
    Book[] findBooksByAuthor(String author);
    int size();

}
