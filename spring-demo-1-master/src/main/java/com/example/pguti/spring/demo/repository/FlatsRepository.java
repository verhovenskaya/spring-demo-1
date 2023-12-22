package com.example.pguti.spring.demo.repository;

import com.example.pguti.spring.demo.entity.Flat;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FlatsRepository extends CrudRepository<Flat, Long> {
    List<Flat> findAll();
}
