package com.example.demo.service;

import com.example.demo.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    public Optional<Product> findById(Long id);

    public List<Product> findAll();

    public void save(Product product);

    public void deleteById(Long id);

    public List<Product> findByPrice(Long minPrice, Long maxPrice);

}
