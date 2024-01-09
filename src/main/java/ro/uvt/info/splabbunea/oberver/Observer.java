package ro.uvt.info.splabbunea.oberver;

import ro.uvt.info.splabbunea.models.Book;

public abstract class Observer {
    public abstract void update(Book book);
}
