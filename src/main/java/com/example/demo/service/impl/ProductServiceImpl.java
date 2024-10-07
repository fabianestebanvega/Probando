package com.example.demo.service.impl;

import com.example.demo.entities.Product;
import com.example.demo.persistence.IProductDao;
import com.example.demo.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements IProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    public Optional<Product> findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public void save(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteById(Long id) {
        productDao.deleteById(id);
    }

    @Override
    public List<Product> findByPrice(Long minPrice, Long maxPrice) {
        return productDao.findByPrice(minPrice,maxPrice);
    }
}
