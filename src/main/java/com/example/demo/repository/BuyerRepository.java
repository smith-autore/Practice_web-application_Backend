package com.example.demo.repository;

import com.example.demo.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;

import java.util.List;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
    List<Buyer> findAll(Sort sort);
}
