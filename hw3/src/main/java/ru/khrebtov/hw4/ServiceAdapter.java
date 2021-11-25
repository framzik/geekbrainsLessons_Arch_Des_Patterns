package ru.khrebtov.hw4;

import ru.khrebtov.hw4.entity.OrderDto;
import ru.khrebtov.hw4.entity.ProductDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ServiceAdapter extends CartServiceImpl {

    private List<OrderDto> orders = new ArrayList<>();
    private String username = "Vasya";
    private OrderServiceImpl orderService = new OrderServiceImpl(orders, username);

    public ServiceAdapter( List<OrderDto> orders, String username) {
        this.orders = orders;
        this.username = username;
    }

    public ServiceAdapter() {
    }

    @Override
    public void removeProduct(ProductDto productDto) {
        lineItems.remove(orderService.findOrdersByUsername(username).get(0).getProductDto());
    }

}
