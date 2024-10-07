package com.example.demo.repository;

import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findProductsByPriceBetween(long minPrice, long maxPrice);


}
