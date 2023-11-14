package ro.uvt.info.splabbunea;

public class Image implements Element{
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

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

    public Image(String imageName) {
        this.imageName = imageName;
    }
}
