package com.example.demo.repository;

import com.example.demo.entities.Maker;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface MakerRepository extends JpaRepository<Maker,Long> {


}
