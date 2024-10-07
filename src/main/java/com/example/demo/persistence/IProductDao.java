package com.example.demo.persistence;

import com.example.demo.entities.Product;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IProductDao {

    public Optional<Product> findById(Long id);

    public List<Product> findAll();

    public void save(Product product);

    public void deleteById(Long id);

    public List<Product> findByPrice(Long minPrice, Long maxPrice);

}
