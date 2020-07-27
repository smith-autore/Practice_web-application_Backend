package com.example.demo.repository;

import com.example.demo.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;

import java.util.List;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Integer> {
    List<Apartment> findAll(Sort sort);
}
