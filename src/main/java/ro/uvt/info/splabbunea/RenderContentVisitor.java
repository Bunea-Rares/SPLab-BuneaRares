package ro.uvt.info.splabbunea;

public class RenderContentVisitor implements Visitor{
    @Override
    public void visitParagraph(Paragraph paragraph) {
            if(paragraph.getAlignStrategy() == null)
                System.out.println(paragraph.getText());
            else
                paragraph.getAlignStrategy().render(paragraph, 20);
    }
    public void visitSection(Sections sections) {
        System.out.println(sections.getTitle());
        for (Element element : sections.getElementList()) {
            System.out.println(element);
        }
    }
    public void visitImage(Image image) {
        System.out.println("Image with name: " + image.getImageName());
    }

    public void visitTable(Table table) {
        System.out.println("Table title: " + table.getTitle());
    }
}