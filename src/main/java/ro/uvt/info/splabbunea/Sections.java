package ro.uvt.info.splabbunea;

import java.util.List;

public class Sections implements Element{
    public String title;
    List<Element> elementList;
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
}
