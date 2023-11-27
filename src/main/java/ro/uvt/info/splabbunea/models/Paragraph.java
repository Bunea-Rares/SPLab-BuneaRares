package ro.uvt.info.splabbunea.models;

import ro.uvt.info.splabbunea.services.AlignStrategy;

public class Paragraph implements Element, Visitee {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public AlignStrategy getAlignStrategy() {
        return alignStrategy;
    }

    private AlignStrategy alignStrategy;
    @Override
    public void add(Element e) {

    }

    @Override
    public void remove(Element e) {

    }

    public void print() {
        if(alignStrategy == null)
            System.out.println(text);
        else
            alignStrategy.render(this, 20);
    }

    public Paragraph(String text) {
        this.text = text;
    }
    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }
    public String getText() {
        return this.text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}
