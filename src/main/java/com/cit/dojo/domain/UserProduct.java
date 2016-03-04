package com.cit.dojo.domain;

public class UserProduct {

    private String name;
    private String id;
    private String ean;
    private String description;

    public UserProduct(String name, String id, String ean, String description) {
        this.name = name;
        this.id = id;
        this.ean = ean;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
