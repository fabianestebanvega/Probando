package com.example.demo.persistence.impl;

import com.example.demo.entities.Maker;
import com.example.demo.persistence.IMakerDao;
import com.example.demo.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MakerDAO implements IMakerDao
{

    @Autowired
    private MakerRepository repo;

    @Override
    public Optional<Maker> findById(Long id) {

        return repo.findById(id);
    }

    @Override
    public List<Maker> findAll() {
        return repo.findAll();
    }

    @Override
    public void save(Maker maker) {
        repo.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
