package ru.khrebtov.hw4.hw5;

public class OrderContext {

    private OrderState orderState;

    public void nextOrderStatus() {
        orderState.nextOrderStatus(this);
    }

    public void previousOrderStatus() {
        orderState.previousOrderStatus(this);
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public String getStatusName() {
        return orderState.getStatusName();
    }
}
