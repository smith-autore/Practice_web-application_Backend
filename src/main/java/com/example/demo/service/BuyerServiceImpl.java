package com.example.demo.service;

import com.example.demo.model.Buyer;
import com.example.demo.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    @Override
    public Buyer create(Buyer buyer) {
         return buyerRepository.save(buyer);
    }

    @Override
    public List<Buyer> readAll() {
        return buyerRepository.findAll();
    }

    @Override
    public Buyer read(int idBuyer) {
        return buyerRepository.getOne(idBuyer);
    }

    @Override
    public boolean update(Buyer buyer, int idBuyer) {
        if (buyerRepository.existsById(idBuyer)) {
            buyer.setIdBuyer(idBuyer);
            buyerRepository.save(buyer);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int idBuyer) {
        if (buyerRepository.existsById(idBuyer)) {
            buyerRepository.deleteById(idBuyer);
            return true;
        }
        return false;
    }
}
