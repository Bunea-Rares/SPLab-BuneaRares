package ro.uvt.info.splabbunea.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public interface Element {


    void add(Element e);
    void remove(Element e);
}
