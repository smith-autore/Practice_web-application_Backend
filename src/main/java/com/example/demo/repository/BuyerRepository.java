package com.example.demo.repository;

import com.example.demo.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
}
