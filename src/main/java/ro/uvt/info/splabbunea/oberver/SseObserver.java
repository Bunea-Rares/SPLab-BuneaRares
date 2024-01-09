package ro.uvt.info.splabbunea.oberver;

import org.springframework.http.MediaType;
import ro.uvt.info.splabbunea.models.Book;

public class SseObserver extends  Observer{
    @Override
    public void update(Book book) {
        emitter.send(book, MediaType.APPLICATION_JSON);
    }
}
