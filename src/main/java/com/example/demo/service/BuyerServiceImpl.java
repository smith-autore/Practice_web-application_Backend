package com.example.demo.service;

import com.example.demo.model.Buyer;
import com.example.demo.repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.List;

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
        return buyerRepository.findAll(Sort.by(Sort.Direction.ASC, "idBuyer"));
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
