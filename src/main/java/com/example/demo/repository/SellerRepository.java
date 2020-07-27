package com.example.demo.repository;

import com.example.demo.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> {
    List<Seller> findAll(Sort sort);
}
