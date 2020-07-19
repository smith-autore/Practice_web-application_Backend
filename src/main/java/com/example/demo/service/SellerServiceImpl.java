package com.example.demo.service;

import com.example.demo.model.Seller;
import com.example.demo.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public void create(Seller seller) {
        sellerRepository.save(seller);
    }

    @Override
    public List<Seller> readAll() {
        return sellerRepository.findAll();
    }

    @Override
    public Seller read(int idSeller) {
        return sellerRepository.getOne(idSeller);
    }

    @Override
    public boolean update(Seller seller, int idSeller) {
        if (sellerRepository.existsById(idSeller)) {
            seller.setIdSeller(idSeller);
            sellerRepository.save(seller);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int idSeller) {
        if (sellerRepository.existsById(idSeller)) {
            sellerRepository.deleteById(idSeller);
            return true;
        }
        return false;
    }
}