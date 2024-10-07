package com.example.demo.persistence;

import com.example.demo.entities.Maker;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface IMakerDao {

    public Optional<Maker> findById(Long id);

    public List<Maker> findAll();

    public void save(Maker maker);

    public void deleteById(Long id);

}
