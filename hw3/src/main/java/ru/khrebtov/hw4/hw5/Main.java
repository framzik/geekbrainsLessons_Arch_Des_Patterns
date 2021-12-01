package ru.khrebtov.hw4.hw5;

public class Main {

    public static void main(String[] args) {
        OrderContext d = new OrderContext();
        d.setOrderState(new OrderCreated());
        System.out.println(d.getStatusName());
        d.nextOrderStatus();
        System.out.println(d.getStatusName());
        d.nextOrderStatus();
        System.out.println(d.getStatusName());
    }
}
