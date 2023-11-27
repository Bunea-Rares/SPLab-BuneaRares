package ro.uvt.info.splabbunea;

import ro.uvt.info.splabbunea.models.*;
import ro.uvt.info.splabbunea.services.AlignStrategy;
import ro.uvt.info.splabbunea.services.AlignmentStrategyFactory;

public class RenderContentVisitor implements Visitor<String>{
    AlignStrategy alignStrategy = AlignmentStrategyFactory.create(TextAlignment.left);

    @Override
    public String visitBook(Book book) {
            System.out.println(book.getTitle());
            book.getAuthorList().forEach(Author::print);
            return "";
    }

    @Override
    public String visitSection(Section section) {
        System.out.println(section.getTitle());
        section.getElementList().forEach(element -> {
            if(element instanceof Table) {
                ((Table) element).accept(this);
            } else if(element instanceof TableOfContents) {
                ((TableOfContents) element).accept(this);
            } else if(element instanceof Book) {
                ((Book) element).accept(this);
            } else if(element instanceof Paragraph) {
                ((Paragraph) element).accept(this);
            } else if(element instanceof ImageProxy) {
                ((ImageProxy) element).accept(this);
            } else if(element instanceof  Image) {
                ((Image) element).accept(this);
            } else if(element instanceof Table) {
                ((Table) element).accept(this);
            }
        });
        return "";
    }

    @Override
    public String visitTableOfContents(TableOfContents tableOfContents) {
        System.out.println(tableOfContents.getContent());
        return "";
    }

    @Override
    public String visitParagraph(Paragraph paragraph) {
        alignStrategy.render(paragraph, 20);
        return "";
    }

    @Override
    public String visitImageProxy(ImageProxy imageProxy) {
        System.out.println(imageProxy.url());
        return "";
    }

    @Override
    public String visitImage(Image image) {
        System.out.println(image.url());
        return "";
    }

    @Override
    public String visitTable(Table table) {
        System.out.println(table.getTitle());
        return "";
    }
}