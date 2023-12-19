package ro.uvt.info.splabbunea.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(force = true)
public class Author {
    @Id
    private Integer id;
    private String name;
    public void print() {
        System.out.println(name);
    }

    public Author(String name) {
        this.name = name;
    }
}
