package ro.uvt.info.splabbunea.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section implements Visitee {
    private final List<Author> authorList = new ArrayList<Author>();

    public int getId() {
        return id;
    }

    private int id;

    public Book(String title, Integer id) {
        super(title);
        this.id = id;
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
}
