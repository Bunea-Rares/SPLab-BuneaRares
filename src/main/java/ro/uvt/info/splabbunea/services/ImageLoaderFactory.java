package ro.uvt.info.splabbunea.services;

public class ImageLoaderFactory {
    public static ImageLoader create(String url) {
        if(url.contains("bmp")) {
            return new BMPImageLoader();
        } else if(url.contains("jpg")) {
            return new JPGImageLoader();
        } else {
            throw new IllegalArgumentException("Image extension not supported");
        }
    }
}
