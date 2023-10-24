package ro.uvt.info.splabbunea;

public class Image implements Element{
    private String imageName;

    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        System.out.println(imageName);
    }
}
