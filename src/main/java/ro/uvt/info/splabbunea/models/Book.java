package ro.uvt.info.splabbunea.models;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(force = true)
public class Book extends Section implements Visitee {

    @ManyToMany(targetEntity = Author.class)
    private final List<Author> authorList = new ArrayList<Author>();

    public int getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "titlu")
    public String titlu;


    public Book(String title) {
        super(title);
        this.titlu = title;
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
