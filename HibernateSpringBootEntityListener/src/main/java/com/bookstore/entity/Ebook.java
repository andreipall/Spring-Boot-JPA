package com.bookstore.entity;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Ebook extends Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ebook{" + "format=" + format + '}';
    }

}
