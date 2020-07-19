package com.example.demo.controller;

import com.example.demo.model.Apartment;
import com.example.demo.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApartmentController {

    private final ApartmentService apartmentService;

    @Autowired
    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @PostMapping(value = "/apartments")
    public ResponseEntity<?> create(@RequestBody Apartment apartment) {
        apartmentService.create(apartment);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "apartments")
    public ResponseEntity<List<Apartment>> read() {
        final List<Apartment> apartments = apartmentService.readAll();

        return apartments != null && !apartments.isEmpty()
                ? new ResponseEntity<>(apartments, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/apartments/{id}")
    public ResponseEntity<Apartment> read(@PathVariable(name = "id") int idApartment) {
        final Apartment apartment = apartmentService.read(idApartment);

        return apartment != null
                ? new ResponseEntity<>(apartment, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/apartments/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int idApartment, @RequestBody Apartment apartment) {
        final boolean updated = apartmentService.update(apartment, idApartment);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/apartments/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int idApartment) {
        final boolean deleted = apartmentService.delete(idApartment);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
