package ro.uvt.info.splabbunea.services;

import ro.uvt.info.splabbunea.models.PictureContent;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class BMPImageLoader implements ImageLoader{
    BufferedImage image;
    @Override
    public PictureContent load(String url) {
        try {

            image = ImageIO.read(new File(url));
            return new PictureContent(image);
        } catch (Exception e) {
            return null;
        }
    }
}
