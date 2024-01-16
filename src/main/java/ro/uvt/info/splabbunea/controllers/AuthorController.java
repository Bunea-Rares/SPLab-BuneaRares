package ro.uvt.info.splabbunea.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splabbunea.models.*;
import ro.uvt.info.splabbunea.services.AuthorService;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/books")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getBooks() {
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }

    @GetMapping("/authors/{id}")
    public ResponseEntity<Optional<Author>> getBookById(@PathVariable Integer id) {
        return new ResponseEntity<>(authorService.getAllAuthors().stream().filter(book -> book.getId() == id).findFirst(), HttpStatus.OK);
    }

    @PostMapping(path = "/authors", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addBook(@RequestBody Author author) {
        authorService.addAuthors(author);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping(path = "/authors", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity editBook(@RequestBody Author author) {
        authorService.editAuthor(author);
        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping(path = "/authors", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteBook(@RequestBody Integer bookId) {
        authorService.deleteAuthors(bookId);
        return new ResponseEntity(HttpStatus.OK);
    }

}

