package com.example.demo.repository;

import com.example.demo.model.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;

import java.util.List;

@Repository
public interface DealRepository extends JpaRepository<Deal, Integer> {
    List<Deal> findAll(Sort sort);
}
