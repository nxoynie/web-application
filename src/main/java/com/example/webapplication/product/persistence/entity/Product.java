package com.example.webapplication.product.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Long id;
    private String name;
    private String type;
    private Integer milliliter;
    private String imageURL;

    public Product(String name, String type, Integer milliliter, String imageURL) {
        this.name = name;
        this.type = type;
        this.milliliter = milliliter;
        this.imageURL = imageURL;
    }

    public Product() {
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMilliliter() {
        return milliliter;
    }

    public void setMilliliter(Integer milliliter) {
        this.milliliter = milliliter;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return  name + " ( type = " + type  + "in " + milliliter + " milliliters." + "imageUrl= " + imageURL + " )";
    }
}
