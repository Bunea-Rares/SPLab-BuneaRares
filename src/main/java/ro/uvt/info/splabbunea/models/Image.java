package ro.uvt.info.splabbunea.models;

import ro.uvt.info.splabbunea.services.ImageLoader;
import ro.uvt.info.splabbunea.services.ImageLoaderFactory;

import java.awt.*;

public class Image implements Element, Picture, Visitee {
    String url;
    Dimension dim;
    PictureContent content;

    public Image(String url) {
        this.url = url;
        ImageLoader imageLoader =  ImageLoaderFactory.create(url);
        content = imageLoader.load(url);
    }

    @Override
    public void add(Element e) {

    }
    @Override
    public void remove(Element e) {

    }

    @Override
    public String url() {
        return null;
    }
    @Override
    public Dimension dim() {
        return null;
    }
    @Override
    public PictureContent content() {
        return null;
    }

    @Override
    public void accept(Visitor v) {
        v.visitImage(this);
    }
}
