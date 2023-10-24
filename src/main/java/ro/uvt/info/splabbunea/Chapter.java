package ro.uvt.info.splabbunea;

import java.util.List;

public class Chapter {
    private String name;
    private List<SubChapter> subChapterList;

    public void print() {
        System.out.println(name);
    }
}
