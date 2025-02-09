package com.example.lesson.spring_docker.controller;

import com.example.lesson.spring_docker.entity.Product;
import com.example.lesson.spring_docker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductRepository repository;

    @Autowired
    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Product> getAll() {
        return repository.findAll();
    }
}
