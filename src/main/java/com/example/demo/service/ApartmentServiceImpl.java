package com.example.demo.service;

import com.example.demo.model.Apartment;
import com.example.demo.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ApartmentServiceImpl implements ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Override
    public Apartment create(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }

    @Override
    public List<Apartment> readAll() {
        return apartmentRepository.findAll();
    }

    @Override
    public Apartment read(int idApartment) {
        return apartmentRepository.getOne(idApartment);
    }

    @Override
    public boolean update(Apartment apartment, int idApartment) {
        if (apartmentRepository.existsById(idApartment)) {
            apartment.setIdApartment(idApartment);
            apartmentRepository.save(apartment);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int idApartment) {
        if (apartmentRepository.existsById(idApartment)) {
            apartmentRepository.deleteById(idApartment);
            return true;
        }
        return false;
    }
}
