package ro.uvt.info.splabbunea.models;

public class Author {
    private String name;
    public void print() {
        System.out.println(name);
    }

    public Author(String name) {
        this.name = name;
    }
}
