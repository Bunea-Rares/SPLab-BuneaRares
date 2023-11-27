package ro.uvt.info.splabbunea.services;

import ro.uvt.info.splabbunea.models.PictureContent;

public interface ImageLoader {
    PictureContent load(String url);
}
