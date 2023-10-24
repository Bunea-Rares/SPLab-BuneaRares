package ro.uvt.info.splabbunea;

import java.util.List;

public class Paragraph implements Element{
    private String text;

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(text);
    }

    public Paragraph(String text) {
        this.text = text;
    }
}
