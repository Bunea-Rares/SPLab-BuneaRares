package ro.uvt.info.splabbunea.oberver;

import org.springframework.http.MediaType;
import ro.uvt.info.splabbunea.models.Book;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import ro.uvt.info.splabbunea.oberver.Observer;

import java.io.IOException;

public class SseObserver implements Observer {
    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book) {
        try{
            emitter.send(book, MediaType.APPLICATION_JSON);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
