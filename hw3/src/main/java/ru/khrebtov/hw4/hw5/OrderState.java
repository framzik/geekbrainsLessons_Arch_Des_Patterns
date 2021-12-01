package ru.khrebtov.hw4.hw5;

public interface OrderState {
    String getStatusName();
    void nextOrderStatus(OrderContext orderContext);
    void previousOrderStatus(OrderContext orderContext);
}
