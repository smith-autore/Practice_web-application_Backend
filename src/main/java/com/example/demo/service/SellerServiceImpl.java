package com.example.demo.service;

import com.example.demo.model.Seller;
import com.example.demo.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public Seller create(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> readAll() {
        return sellerRepository.findAll(Sort.by(Sort.Direction.ASC, "idSeller"));
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