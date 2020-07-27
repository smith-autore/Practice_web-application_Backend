package com.example.demo.service;

import com.example.demo.model.Apartment;
import com.example.demo.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.List;

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
        return apartmentRepository.findAll(Sort.by(Sort.Direction.ASC, "idApartment"));
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
