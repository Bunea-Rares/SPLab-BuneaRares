package ro.uvt.info.splabbunea.services;

import ro.uvt.info.splabbunea.models.Paragraph;

public class LeftAlignmentStrategy implements AlignStrategy{
    @Override
    public void render(Paragraph p, int spaces) {
        String text = p.getText();
        String[] words = text.split(" ");
        int currentLineLength = 0;
        for (String word : words) {
            if (currentLineLength + word.length() <= spaces) {
                System.out.print(word + " ");
                currentLineLength += word.length() + 1;
            } else {
                System.out.println();
                System.out.print(word + " ");
                currentLineLength = word.length() + 1;
            }
        }
        System.out.println();
    }
}
