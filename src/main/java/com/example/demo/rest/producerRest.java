package com.example.demo.rest;

import com.example.demo.modelo.client;
import com.example.demo.modelo.producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/producer/")
public class producerRest {
    @Autowired
    private com.example.demo.service.producerService producerService;
    @GetMapping
    private ResponseEntity<List<producer>> getAllProducer() {
        return ResponseEntity.ok(producerService.findAll());
    }
    @PostMapping
    private ResponseEntity<producer> saveProducer(@RequestBody producer producer){
        try{
            producer producerGuardada=producerService.save(producer);
            return ResponseEntity.created(new URI("/producer/"+producerGuardada.getId())).body(producerGuardada);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}
