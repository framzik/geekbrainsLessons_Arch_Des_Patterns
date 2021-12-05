package ru.khrebtov.hw6.Identity_map;

import ru.khrebtov.hw6.Product;

import java.util.HashMap;
import java.util.Map;

public class CashedProducts implements ProductRepo{

    private final Map<Long, Product> internalMap;
    private final ProductRepo productRepo;

    public CashedProducts(ProductRepo productRepo) {
        this.productRepo = productRepo;
        internalMap = new HashMap<>();
    }

    @Override
    public Product getProduct(Long productId) {
        if(!internalMap.containsKey(productId)){
            internalMap.put(productId,productRepo.getProduct(productId));
        }
        return internalMap.get(productId);
    }
}
