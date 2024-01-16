package ro.uvt.info.splabbunea.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splabbunea.models.Author;
import ro.uvt.info.splabbunea.models.Book;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}