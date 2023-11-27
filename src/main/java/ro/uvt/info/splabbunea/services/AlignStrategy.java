package ro.uvt.info.splabbunea.services;

import ro.uvt.info.splabbunea.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph p, int spaces);
}
