package ru.khrebtov.hw4;

import ru.khrebtov.hw4.entity.ProductDto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class CartServiceImpl implements CartService {

    protected final Map<String, Integer> lineItems;

    public CartServiceImpl(Map<String, Integer> lineItems) {
        this.lineItems = lineItems;
    }

    public CartServiceImpl() {
        lineItems = new HashMap<>();
    }

    @Override
    public void removeProduct(ProductDto productDto) {
        lineItems.remove(String.valueOf(productDto.getId()));
    }
}
