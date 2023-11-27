package ro.uvt.info.splabbunea.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section implements Visitee {
//    private List<Element> elementsList = new ArrayList<Element>();
    private List<Author> authorList = new ArrayList<Author>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authorList.add(author);
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }
    //    public void addContent(Element element) {
//        elementsList.add(element);
//    }


}
