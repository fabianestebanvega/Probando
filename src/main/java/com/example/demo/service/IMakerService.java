package com.example.demo.service;

import com.example.demo.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerService {
    public Optional<Maker> findById(Long id);

    public List<Maker> findAll();

    public void save(Maker maker);

    public void deleteById(Long id);

}
