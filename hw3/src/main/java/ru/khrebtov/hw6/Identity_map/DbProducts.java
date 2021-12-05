package ru.khrebtov.hw6.Identity_map;

import ru.khrebtov.hw6.Product;

public class DbProducts implements ProductRepo{

    @Override
    public Product getProduct(Long productId) {
        //get product from db

        return new Product();
    }
}
