package ro.uvt.info.splabbunea.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.splabbunea.models.Book;
import ro.uvt.info.splabbunea.models.BooksSubject;
import ro.uvt.info.splabbunea.oberver.SseObserver;
import ro.uvt.info.splabbunea.services.BookService;

import java.nio.channels.SelectionKey;
@RestController
public class BookSseController {
    private final BookService bookService;

    BooksSubject allBooksSubject = new BooksSubject();

    public BookSseController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);

        try {
            allBooksSubject.attach(new SseObserver(emitter));
        } catch (Exception e) {
            emitter.completeWithError(e);
        }
        return emitter;
    }
    @PostMapping(path = "/books-sse", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addBook(@RequestBody Book book) {
        bookService.addBook(book);
        allBooksSubject.notifyObservers(book);
        return new ResponseEntity(HttpStatus.OK);
    }
}
