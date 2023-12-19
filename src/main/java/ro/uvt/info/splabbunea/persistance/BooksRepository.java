package ro.uvt.info.splabbunea.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splabbunea.models.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}