package books.dao;

import books.model.Book;

import java.util.function.Predicate;

public class LibraryImpl implements Library {
    private Book[] books;
    private int size;

    public LibraryImpl(int capacity) {
        books = new Book[capacity];
    }

    @Override
    public boolean addBook(Book book) {
        if (book == null || size == books.length || findBookByIsbn(book.getIsbn()) != null) {
            return false;
        }
        books[size++] = book;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (isbn == books[i].getIsbn()) {
                Book bookToRemove = books[i];
                books[i] = books[--size];
                return bookToRemove;
            }
        }
        return null;
    }

    @Override
    public Book findBookByIsbn(long isbn) {
        for (int i = 0; i < size; i++) {
            if (isbn == books[i].getIsbn()) {
                return books[i];
            }
        }
        return null;
    }

    @Override
    public Book[] findBooksByAuthor(String author) {
        Predicate<Book> predicate = book -> book.getAuthor().equals(author);
        return findBooksByPredicate(predicate);
    }

    private Book[] findBooksByPredicate(Predicate<Book> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(books[i])) {
                count++;
            }
        }
        Book[] res = new Book[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (predicate.test(books[i])) {
                res[j++] = books[i];
            }
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }
}

