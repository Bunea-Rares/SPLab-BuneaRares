package ro.uvt.info.splabbunea;

import java.util.List;

public interface Element {

    void add(Element e);
    default Element getElement() {
        return this;
    };
    void remove(Element e);
    void print();
}
