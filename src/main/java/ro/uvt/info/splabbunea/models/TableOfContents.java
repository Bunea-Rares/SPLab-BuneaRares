package ro.uvt.info.splabbunea.models;

import ro.uvt.info.splabbunea.models.Element;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element, Visitee {
        private String content;
    List<Element> elementList = new ArrayList<Element>();

    public String getContent() {
        return content;
    }

    @Override
    public void add(Element e) {
        elementList.add(e);
    }

    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }



    @Override
    public void accept(Visitor v) {
        v.visitTableOfContents(this);
    }
}
