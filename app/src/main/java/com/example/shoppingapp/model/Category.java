package com.example.shoppingapp.model;

public class Category {
    Integer id;
    Integer imageurl;

    public Category(Integer id, int imageurl) {
        this.id = id;
        this.imageurl = imageurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}
