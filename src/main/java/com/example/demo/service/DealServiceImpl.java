package com.example.demo.service;

import com.example.demo.model.Deal;
import com.example.demo.repository.DealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class DealServiceImpl implements DealService {

    @Autowired
    private DealRepository dealRepository;

    @Override
    public Deal create(Deal deal) {
        dealRepository.save(deal);
    }

    @Override
    public List<Deal> readAll() {
        return dealRepository.findAll();
    }

    @Override
    public Deal read(int idDeal) {
        return dealRepository.getOne(idDeal);
    }

    @Override
    public boolean update(Deal deal, int idDeal) {
        if (dealRepository.existsById(idDeal)) {
            deal.setIdDeal(idDeal);
            dealRepository.save(deal);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int idDeal) {
        if (dealRepository.existsById(idDeal)) {
            dealRepository.deleteById(idDeal);
            return true;
        }
        return false;
    }
}
