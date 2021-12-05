package ru.khrebtov.hw7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import ru.khrebtov.hw7.service.ProductService;
import ru.khrebtov.hw7.entity.ProductDto;

import java.util.Optional;

@RequestMapping("/product")
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public Page<ProductDto> findAll(@RequestParam("categoryId") Optional<Long> categoryId,
                                    @RequestParam("namePattern") Optional<String> namePattern,
                                    @RequestParam("page") Optional<Integer> page,
                                    @RequestParam("size") Optional<Integer> size,
                                    @RequestParam("sortField") Optional<String> sortField) {
        return productService.findAll(
                categoryId,
                namePattern,
                page.orElse(1) - 1,
                size.orElse(5),
                "id");
    }

    @GetMapping("/{productId}")
    public ProductDto findById(@PathVariable("productId") Long id) {
        Optional<ProductDto> oProduct = productService.findById(id);

        return oProduct.orElseGet(ProductDto::new);
    }
}
