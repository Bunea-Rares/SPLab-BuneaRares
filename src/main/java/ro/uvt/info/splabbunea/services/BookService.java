package ro.uvt.info.splabbunea.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.splabbunea.models.Book;
import ro.uvt.info.splabbunea.persistance.BooksRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BooksRepository booksRepository;
    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAllBooks(){
        return booksRepository.findAll();
    }

    public Optional<Book> getBookById(Integer id) {
        return booksRepository.findById(id);
    }

    public void addBook(Book book) {
        booksRepository.save(book);
    }

    public void editBook(Book book) {
        Optional<Book> bookToEdit = booksRepository.findById(book.getId());

        bookToEdit.ifPresent(b -> {
            // Update the title of the found book
            b.setTitle(book.title);
        });
    }

    public void deleteBook(Integer id) {

    }
}
