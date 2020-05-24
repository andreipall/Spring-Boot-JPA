package com.jpa.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="player")
public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id    
    private Long id;

    private String name;
    private String city;
    private int age;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + '}';
    }    
}
