package ro.uvt.info.splabbunea.services;

import org.springframework.stereotype.Service;
import ro.uvt.info.splabbunea.models.Author;
import ro.uvt.info.splabbunea.persistance.AuthorsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorsRepository authorsRepository;
    public AuthorService(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    public List<Author> getAllAuthors(){
        return authorsRepository.findAll();
    }

    public Optional<Author> getBookById(Integer id) {
        return authorsRepository.findById(id);
    }

    public void addAuthors(Author author) {
        authorsRepository.save(author);
    }

    public void editAuthor(Author author) {
        Optional<Author> authorToEdit = authorsRepository.findById(author.getId());

        authorToEdit.ifPresent(b -> {
            b.setName(author.getName());
            authorsRepository.save(b);
        });
    }

    public void deleteAuthors(Integer id) {
        Optional<Author> author = authorsRepository.findById(id);
        author.ifPresent(b -> {
            authorsRepository.delete(b);
        });
    }
}
