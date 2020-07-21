package com.example.demo.controller;

import com.example.demo.model.Deal;
import com.example.demo.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DealController {

    private final DealService dealService;

    @Autowired
    public DealController(DealService dealService) {
        this.dealService = dealService;
    }

    @PostMapping(value = "/deals")
    public ResponseEntity<?> create(@RequestBody Deal deal) {
        Deal dealPost = dealService.create(deal);
        return new ResponseEntity<>(dealPost, HttpStatus.CREATED);
    }

    @GetMapping(value = "deals")
    public ResponseEntity<List<Deal>> read() {
        final List<Deal> deals = dealService.readAll();

        return deals != null && !deals.isEmpty()
                ? new ResponseEntity<>(deals, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/deals/{id}")
    public ResponseEntity<Deal> read(@PathVariable(name = "id") int idDeal) {
        final Deal deal = dealService.read(idDeal);

        return deal != null
                ? new ResponseEntity<>(deal, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/deals/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int idDeal, @RequestBody Deal deal) {
        final boolean updated = dealService.update(deal, idDeal);

        return updated
                ? new ResponseEntity<>(deal, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/deals/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int idDeal) {
        final boolean deleted = dealService.delete(idDeal);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}
