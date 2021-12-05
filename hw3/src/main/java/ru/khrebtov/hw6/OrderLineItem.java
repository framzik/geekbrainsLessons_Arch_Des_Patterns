package ru.khrebtov.hw6;

import java.math.BigDecimal;

public class OrderLineItem {

    private Product product;

    private BigDecimal price;

    private Integer qty;

    private String color;

    private String material;

    public OrderLineItem() {
    }

    public OrderLineItem(Product product,
                         BigDecimal price,
                         Integer qty,
                         String color,
                         String material) {
        this.product = product;
        this.price = price;
        this.qty = qty;
        this.color = color;
        this.material = material;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}