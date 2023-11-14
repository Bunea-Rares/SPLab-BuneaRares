package ro.uvt.info.splabbunea;

public class Table implements Element {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(title);
    }}

