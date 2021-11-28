package ru.khrebtov.hw4.hw5;

public class OrderDelivered implements OrderState {
    @Override
    public void nextOrderStatus(OrderContext orderContext) {
        System.out.println("Order Delivered,  next Order Status NOTHING happens");
    }

    @Override
    public void previousOrderStatus(OrderContext orderContext) {
        orderContext.setOrderState(new OrderSend());
    }

    @Override
    public String getStatusName() {
        return OrderStatus.DELIVERED.name();
    }
}
