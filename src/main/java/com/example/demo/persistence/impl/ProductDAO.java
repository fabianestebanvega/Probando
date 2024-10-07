package com.example.demo.persistence.impl;

import com.example.demo.entities.Product;
import com.example.demo.persistence.IProductDao;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductDAO implements IProductDao
{

    @Autowired
    private ProductRepository repo;

    @Override
    public Optional<Product> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repo.findAll();
    }

    @Override
    public void save(Product product) {
        repo.save(product);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<Product> findByPrice(Long minPrice, Long maxPrice) {
        return repo.findProductsByPriceBetween(minPrice, maxPrice);
    }
}
