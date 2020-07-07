package com.demo.model;

public class Customer {

    private Long id;
    private String name;
    private String province;

    public Customer() {
    }

    public Customer(Long id, String name, String province) {
        this.id = id;
        this.name = name;
        this.province = province;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
