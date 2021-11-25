package ru.khrebtov.hw4;

import ru.khrebtov.hw4.entity.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> findOrdersByUsername(String username);
}
