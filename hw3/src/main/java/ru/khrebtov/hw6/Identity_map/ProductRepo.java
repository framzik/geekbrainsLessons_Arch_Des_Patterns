package ru.khrebtov.hw6.Identity_map;

import ru.khrebtov.hw6.Product;

public interface ProductRepo {
    Product getProduct(Long productId);
}
