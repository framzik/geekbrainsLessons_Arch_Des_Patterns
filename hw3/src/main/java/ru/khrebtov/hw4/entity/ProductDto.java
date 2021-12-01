package ru.khrebtov.hw4.entity;

import java.math.BigDecimal;
import java.util.List;

public class ProductDto {

    private Long id;

    private String name;

    private String description;

    private BigDecimal price;


    private List<Long> pictures;

    public ProductDto() {
    }

    public ProductDto(Long id, String name, String description, BigDecimal price,
                      List<Long> pictures) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.pictures = pictures;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public List<Long> getPictures() {
        return pictures;
    }

    public void setPictures(List<Long> pictures) {
        this.pictures = pictures;
    }
}
