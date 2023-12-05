package ro.uvt.info.splabbunea.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.splabbunea.models.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private List<Book> bookList = new ArrayList<>();


    public List<Book> getAllBooks() {
        return bookList;
    }

    public Optional<Book> getBookById(Integer id) {
        return bookList.stream().filter(book -> book.getId() == id).findFirst();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void editBook(Book book) {
        Optional<Book> bookToEdit = getBookById(book.getId());

        bookToEdit.ifPresent(b -> {
            // Update the title of the found book
            b.setTitle(book.title);
        });
    }

    public void deleteBook(Integer id) {
        Iterator<Book> iterator = bookList.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }
}
