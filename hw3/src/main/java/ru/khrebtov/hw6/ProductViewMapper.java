package ru.khrebtov.hw6;

import java.net.URL;

public class ProductViewMapper {
    public ProductView map(Product product, URL imgUrl, String description) {
        ProductView view = new ProductView();
        view.setName(product.getName());
        view.setPrice(product.getPrice());
        view.setDescription(description);
        view.setImgUrl(imgUrl);
        return view;
    }
}
