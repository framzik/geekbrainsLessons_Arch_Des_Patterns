package ru.khrebtov.hw4;

import ru.khrebtov.hw4.entity.OrderDto;

import java.util.List;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {

    private final List<OrderDto> orders;
    private final String username;

    public OrderServiceImpl(List<OrderDto> orders, String username) {
        this.orders = orders;
        this.username = username;
    }

    @Override
    public List<OrderDto> findOrdersByUsername(String username) {
        return orders.stream().
                     filter(o -> o.getUsername().equals(username))
                     .collect(Collectors.toList());
    }
}
