package ru.khrebtov.hw4.hw5;

public class OrderCreated implements OrderState {

    @Override
    public void nextOrderStatus(OrderContext orderContext) {
        orderContext.setOrderState(new OrderSend());
    }

    @Override
    public void previousOrderStatus(OrderContext orderContext) {
        System.out.println("Order CREATED, previous OrderStatus NOTHING happens");
    }

    @Override
    public String getStatusName() {
        return OrderStatus.CREATED.name();
    }
}
