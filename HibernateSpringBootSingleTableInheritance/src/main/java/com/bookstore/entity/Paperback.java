package com.bookstore.entity;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import org.springframework.lang.NonNull;

@Entity
@DiscriminatorValue("3")
public class Paperback extends Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @NonNull
    private String sizeIn;
    @NonNull
    private String weightLbs;

    public String getSizeIn() {
        return sizeIn;
    }

    public void setSizeIn(String sizeIn) {
        this.sizeIn = sizeIn;
    }

    public String getWeightLbs() {
        return weightLbs;
    }

    public void setWeightLbs(String weightLbs) {
        this.weightLbs = weightLbs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Paperback{" + "sizeIn=" + sizeIn + ", weightLbs=" + weightLbs + '}';
    }

}
