package ru.khrebtov.hw7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.khrebtov.hw7.repo.ProductRepository;
import ru.khrebtov.hw7.entity.ProductDto;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Page<ProductDto> findAll(Optional<Long> categoryId, Optional<String> namePattern,
                                    Integer page, Integer size, String sortField) {

        return productRepository.findAll(PageRequest.of(page, size, Sort.by(sortField)))
                                .map(product -> new ProductDto(product.getId(),
                                                               product.getName(),
                                                               product.getDescription(),
                                                               product.getPrice()));
    }

    @Override
    public Optional<ProductDto> findById(Long id) {
        return productRepository.findById(id)
                                .map(product -> new ProductDto(product.getId(),
                                                               product.getName(),
                                                               product.getDescription(),
                                                               product.getPrice()));
    }
}
