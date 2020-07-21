package com.example.demo.controller;

import com.example.demo.model.Buyer;
import com.example.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BuyerController {

    private final BuyerService buyerService;

    @Autowired
    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @PostMapping(value = "/buyers")
    public ResponseEntity<?> create(@RequestBody Buyer buyer) {
        Buyer buyerPost = buyerService.create(buyer);
        return new ResponseEntity<>(buyerPost, HttpStatus.CREATED);
    }

    @GetMapping(value = "buyers")
    public ResponseEntity<List<Buyer>> read() {
        final List<Buyer> buyers = buyerService.readAll();

        return buyers != null && !buyers.isEmpty()
                ? new ResponseEntity<>(buyers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/buyers/{id}")
    public ResponseEntity<Buyer> read(@PathVariable(name = "id") int idBuyer) {
        final Buyer buyer = buyerService.read(idBuyer);

        return buyer != null
                ? new ResponseEntity<>(buyer, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/buyers/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int idBuyer, @RequestBody Buyer buyer) {
        final boolean updated = buyerService.update(buyer, idBuyer);

        return updated
                ? new ResponseEntity<>(buyer, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/buyers/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int idBuyer) {
        final boolean deleted = buyerService.delete(idBuyer);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
