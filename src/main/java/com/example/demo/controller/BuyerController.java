package com.example.demo.controller;

import com.example.demo.model.Buyer;
import com.example.demo.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    private final BuyerService buyerService;

    @Autowired
    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }

    @PostMapping(value = "/buyers")
    public ResponseEntity<?> create(@RequestBody Buyer buyer) {
        buyerService.create(buyer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "buyers")
    public ResponseEntity<List<Buyer>> read() {
        final List<Buyer> buyers = buyerService.readAll();

        return buyers != null && !buyers.isEmpty()
                ? new ResponseEntity<>(buyers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/buyers/{id}")
    public ResponseEntity<Buyer> read(@PathVariable(name = "id") int id_buyer) {
        final Buyer buyer = buyerService.read(id_buyer);

        return buyer != null
                ? new ResponseEntity<>(buyer, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/buyers/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id_buyer, @RequestBody Buyer buyer) {
        final boolean updated = buyerService.update(buyer, id_buyer);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/buyers/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id_buyer) {
        final boolean deleted = buyerService.delete(id_buyer);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
