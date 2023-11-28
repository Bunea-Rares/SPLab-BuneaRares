package ro.uvt.info.splabbunea.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splabbunea.RenderContentVisitor;
import ro.uvt.info.splabbunea.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/books")
public class BooksController {
    private List<Book> bookList = List.of(
            new Book("Cea mai tare carte", 0),
            new Book("Carte cool 2", 1)
    );


//    public BooksController() {
//        bookList.add(book);
//        book2.add(book2);
//    }

//    @GetMapping("/statistics")
//    public ResponseEntity<?> printStatistics() {
//        Section cap1 = new Section("Capitolul 1");
//        Paragraph p1 = new Paragraph("Paragraph 1 wdasihduai uhdwau hdsauhu hduwa hdusa hduah udsau hdsahuh duia");
//        cap1.add(p1);
//        Paragraph p2 = new Paragraph("Paragraph 2");
//        cap1.add(p2);
//        Paragraph p3 = new Paragraph("Paragraph 3");
//        cap1.add(p3);
//        Paragraph p4 = new Paragraph("Paragraph 4");
//        cap1.add(p4);
////        cap1.add(new ImageProxy("ImageOne"));
////        cap1.add(new Image("ImageTwo"));
//        cap1.add(new Paragraph("Some text"));
//        cap1.add(new Table("Table 1"));
//        cap1.accept(new RenderContentVisitor());
////        BookStatistics stats = new BookStatistics();
////        cap1.accept(stats);
////        stats.printStatistics();
//        return new ResponseEntity<>("", HttpStatus.OK);
//    }
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Optional<Book>> getBookById(@PathVariable Integer id) {
        return new ResponseEntity<>(bookList.stream().filter(book -> book.getId() == id).findFirst(), HttpStatus.OK);
    }

    @PostMapping(path = "/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addBook() {

    }
//
//    @DeleteMapping("/books/{id}")
//    public ResponseEntity getBooks(@PathVariable Integer id) {
//
//    }
}

