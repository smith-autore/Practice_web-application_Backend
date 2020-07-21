package com.example.demo.controller;

import com.example.demo.model.Seller;
import com.example.demo.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SellerController {

    private final SellerService sellerService;

    @Autowired
    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @PostMapping(value = "/sellers")
    public ResponseEntity<?> create(@RequestBody Seller seller) {
        Seller sellerPost = sellerService.create(seller);
        return new ResponseEntity<>(sellerPost, HttpStatus.CREATED);
    }

    @GetMapping(value = "sellers")
    public ResponseEntity<List<Seller>> read() {
        final List<Seller> sellers = sellerService.readAll();

        return sellers != null && !sellers.isEmpty()
                ? new ResponseEntity<>(sellers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/sellers/{id}")
    public ResponseEntity<Seller> read(@PathVariable(name = "id") int idSeller) {
        final Seller seller = sellerService.read(idSeller);

        return seller != null
                ? new ResponseEntity<>(seller, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/sellers/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int idSeller, @RequestBody Seller seller) {
        final boolean updated = sellerService.update(seller, idSeller);

        return updated
                ? new ResponseEntity<>(seller, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/sellers/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int idSeller) {
        final boolean deleted = sellerService.delete(idSeller);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}