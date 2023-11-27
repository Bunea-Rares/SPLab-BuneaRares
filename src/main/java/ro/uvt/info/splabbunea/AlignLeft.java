package ro.uvt.info.splabbunea;


import ro.uvt.info.splabbunea.models.Paragraph;
import ro.uvt.info.splabbunea.services.AlignStrategy;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph p, int spaces) {
        String text = p.getText();
        String[] arr = text.split(" ");
        int length = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() + length >= spaces - 1) {
                arr[i] = "\n" + arr[i];
                length = arr[i].length();
            }
            else {
                length += arr[i].length();
            }
        }
        arr[0] = "  " + arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(i == 0) System.out.printf(arr[i]);
            else if(arr[i].contains("\n")) System.out.printf(arr[i]);
            else System.out.printf(" " + arr[i]);
        }
    }
}
