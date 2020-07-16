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
    public void create(Buyer buyer) {
        buyerRepository.save(buyer);
    }

    @Override
    public List<Buyer> readAll() {
        return buyerRepository.findAll();
    }

    @Override
    public Buyer read(int id_buyer) {
        return buyerRepository.getOne(id_buyer);
    }

    @Override
    public boolean update(Buyer buyer, int id_buyer) {
        if (buyerRepository.existsById(id_buyer)) {
            buyer.setId_buyer(id_buyer);
            buyerRepository.save(buyer);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id_buyer) {
        if (buyerRepository.existsById(id_buyer)) {
            buyerRepository.deleteById(id_buyer);
            return true;
        }
        return false;
    }
}
