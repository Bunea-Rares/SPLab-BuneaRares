package ro.uvt.info.splabbunea;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Element> elementsList = new ArrayList<Element>();
    private List<Author> authorList = new ArrayList<Author>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }

    public void addContent(Element element) {
        elementsList.add(element);
    }

    public void print() {
        System.out.println(title);
        authorList.forEach(e -> e.print());
        elementsList.forEach(e -> e.print());

    }
}
