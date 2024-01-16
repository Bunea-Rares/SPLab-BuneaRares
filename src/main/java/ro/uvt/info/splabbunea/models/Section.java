package ro.uvt.info.splabbunea.models;

import jakarta.persistence.*;
import ro.uvt.info.splabbunea.models.Element;

import java.util.ArrayList;
import java.util.List;
public class Section implements Element, Visitee {
    private int id;

    public String title;

    protected List<Element> elementList = new ArrayList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    @Override
    public void add(Element e) {
       elementList.add(e);
    }

    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }


    public Section(String title) {
        this.title = title;
    }
    public Section(){}

    @Override
    public void accept(Visitor v) {
        v.visitSection(this);
    }
}
