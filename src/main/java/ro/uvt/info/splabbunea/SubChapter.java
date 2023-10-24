package ro.uvt.info.splabbunea;

import java.util.List;

public class SubChapter implements Element{
    private String name;

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(name);
    }

    public SubChapter(String name) {
        this.name = name;
    }
}
