package com.example.demo.service.impl;

import com.example.demo.entities.Maker;
import com.example.demo.persistence.IMakerDao;
import com.example.demo.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerDao makerDao;

    @Override
    public Optional<Maker> findById(Long id) {
        return makerDao.findById(id);
    }

    @Override
    public List<Maker> findAll() {
        return makerDao.findAll();
    }

    @Override
    public void save(Maker maker) {
        makerDao.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerDao.deleteById(id);
    }
}
