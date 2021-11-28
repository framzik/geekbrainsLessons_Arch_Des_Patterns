package ru.khrebtov.hw4.hw5;

public class OrderSend implements OrderState {

    @Override
    public void nextOrderStatus(OrderContext orderContext) {
        orderContext.setOrderState(new OrderDelivered());
    }

    @Override
    public void previousOrderStatus(OrderContext orderContext) {
        orderContext.setOrderState(new OrderCreated());
    }

    @Override
    public String getStatusName() {
        return OrderStatus.SEND.name();
    }
}
