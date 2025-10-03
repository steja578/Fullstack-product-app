package com.example.productapi.controller;

import com.example.productapi.model.Product;
import com.example.productapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*") // allow frontend Angular
public class ProductController {

    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return repo.save(product);
    }
}
