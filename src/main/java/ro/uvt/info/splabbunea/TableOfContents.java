package ro.uvt.info.splabbunea;

import java.util.List;

public class TableOfContents implements Element {

    public String content;
    @Override
    public void add(Element e) {
    }

    @Override
    public void remove(Element e) {
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
