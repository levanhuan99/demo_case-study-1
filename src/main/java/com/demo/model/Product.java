package com.demo.model;

public class Product {
    private Long id;
    private String name;
    private String manufactor;
    private int price;

    public Product() {
    }

    public Product(Long id, String name, String manufactor, int price) {
        this.id = id;
        this.name = name;
        this.manufactor = manufactor;
        this.price = price;
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

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
