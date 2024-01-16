package ro.uvt.info.splabbunea.oberver;

import ro.uvt.info.splabbunea.models.Book;

public interface  Observer {
    void update(Book book);
}
