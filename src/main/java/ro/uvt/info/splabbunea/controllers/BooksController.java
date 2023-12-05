package ro.uvt.info.splabbunea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splabbunea.models.*;
import ro.uvt.info.splabbunea.services.BookService;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/books")
public class BooksController {
    private final BookService bookService;

    @Autowired
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable Integer id) {
        return new ResponseEntity<>(bookService.getAllBooks().stream().filter(book -> book.getId() == id).findFirst(), HttpStatus.OK);
    }

    @PostMapping(path = "/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping(path = "/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editBook(@RequestBody Book book) {
        bookService.editBook(book);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping(path = "/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteBook(@RequestBody Integer bookId) {
        bookService.deleteBook(bookId);
        return new ResponseEntity(HttpStatus.OK);
    }

}

