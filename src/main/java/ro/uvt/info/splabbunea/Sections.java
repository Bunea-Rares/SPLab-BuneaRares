package ro.uvt.info.splabbunea;

import java.util.ArrayList;
import java.util.List;

public class Sections implements Element{
    public String title;

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

    List<Element> elementList = new ArrayList<Element>();
    @Override
    public void add(Element e) {
       elementList.add(e);
    }


    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element : elementList) {
            element.print();
        }
    }

    public Sections(String title) {
        this.title = title;
    }
}
