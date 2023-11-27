package ro.uvt.info.splabbunea.models;

import lombok.Getter;
import ro.uvt.info.splabbunea.models.Element;

import java.util.ArrayList;
import java.util.List;

public class Table implements Element, Visitee {
    @Getter
    private String title;
    private final List<Element> elementList = new ArrayList<>();

    public Table(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public void add(Element e) {
        elementList.add(e);
    }

    @Override
    public void remove(Element e) {

    }

    @Override
    public void accept(Visitor v) {
        v.visitTable(this);
    }
}

