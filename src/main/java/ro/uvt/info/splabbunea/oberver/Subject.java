package ro.uvt.info.splabbunea.oberver;

import java.util.List;

public class Subject {
    public List<Observer> observerList;
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }
    public void notifyObservers(){
        observerList.forEach(observer -> {observer.update();});
    }
}
