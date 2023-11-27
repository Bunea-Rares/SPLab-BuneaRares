package ro.uvt.info.splabbunea.services;

import ro.uvt.info.splabbunea.models.TextAlignment;

public class AlignmentStrategyFactory {
    public static AlignStrategy create(TextAlignment strategy) {
        if(strategy.equals(TextAlignment.left)) return new LeftAlignmentStrategy();
        return new RightAlignmentStrategy();
    }
}
