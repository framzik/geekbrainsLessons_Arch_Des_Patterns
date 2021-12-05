package ru.khrebtov.hw6;

public class OrderLineMapper {

    public OrderLineItem map(Order order, String color, String material) {
        OrderLineItem lineItem = new OrderLineItem();
        lineItem.setProduct(order.getProduct());
        lineItem.setPrice(order.getPrice());
        lineItem.setQty(order.getQty());
        lineItem.setColor(color);
        lineItem.setMaterial(material);

        return lineItem;
    }
}
