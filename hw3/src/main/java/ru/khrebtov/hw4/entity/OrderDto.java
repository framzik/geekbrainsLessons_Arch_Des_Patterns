package ru.khrebtov.hw4.entity;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDto {

    private Long id;
    private BigDecimal price;
    private LocalDateTime orderDate;
    private OrderStatus status;
    private String username;
    private ProductDto productDto;

    public OrderDto() {
    }

    public OrderDto(Long id, BigDecimal price, LocalDateTime orderDate, OrderStatus status) {
        this.id = id;
        this.price = price;
        this.orderDate = orderDate;
        this.status = status;
    }

    public OrderDto(Long id, OrderStatus status) {
        this.id = id;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ProductDto getProductDto() {
        return productDto;
    }

    public void setProductDto(ProductDto productDto) {
        this.productDto = productDto;
    }
}
