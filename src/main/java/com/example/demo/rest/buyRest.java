package com.example.demo.rest;


import com.example.demo.modelo.buy;
import com.example.demo.modelo.client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/buy/")
public class buyRest {
    @Autowired
    private com.example.demo.service.buyService buyService;
    @GetMapping
    private ResponseEntity<List<buy>> getAllBuy() {
        return ResponseEntity.ok(buyService.findAll());
    }
    @PostMapping
    private ResponseEntity<buy> saveBuy(@RequestBody buy buy){
        try{
            buy buyGuardada=buyService.save(buy);
            return ResponseEntity.created(new URI("/buy/"+buyGuardada.getId())).body(buyGuardada);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}
