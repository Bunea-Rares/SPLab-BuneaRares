package ro.uvt.info.splabbunea.models;

import ro.uvt.info.splabbunea.oberver.Observer;
import ro.uvt.info.splabbunea.oberver.Subject;

import java.util.ArrayList;
import java.util.List;

public class BooksSubject implements Observer, Subject {


    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Book book) {
        for (Observer observer : observers) {
            observer.update(book);
        }
    }

    @Override
    public void update(Book book) {

    }
}

