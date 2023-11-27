package ro.uvt.info.splabbunea.models;

import ro.uvt.info.splabbunea.models.Visitor;

public interface Visitee {
    void accept(Visitor v);
}
