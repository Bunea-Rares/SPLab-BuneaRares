package ro.uvt.info.splabbunea.oberver;

import ro.uvt.info.splabbunea.models.Book;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers(Book book);
}
