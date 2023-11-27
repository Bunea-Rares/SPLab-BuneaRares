package ro.uvt.info.splabbunea.models;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Element, Picture, Visitee{
    Image realImage;
    Dimension dim;
    String url;
    PictureContent content;
    private final List<Element> elementList = new ArrayList<>();

    public ImageProxy(String url) {
        this.url = url;
        loadImage();
    }
    Image loadImage() {
        if(realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override
    public String url() {
        return url;
    }

    @Override
    public Dimension dim() {
        return dim;
    }

    @Override
    public PictureContent content() {
        return content;
    }

    @Override
    public void accept(Visitor v) {
        v.visitImageProxy(this);
    }

    @Override
    public void add(Element e) {
        elementList.add(e);
    }

    @Override
    public void remove(Element e) {
        elementList.remove(e);
    }
}
