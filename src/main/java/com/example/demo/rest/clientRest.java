package com.example.demo.rest;

import com.example.demo.modelo.client;
import com.example.demo.service.clientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping ("/client/")
public class clientRest {
    @Autowired
    private com.example.demo.service.clientService clientService;
    @GetMapping
    private ResponseEntity <List<client>> getAllClient() {
        return ResponseEntity.ok(clientService.findAll());
    }
    @PostMapping
    private ResponseEntity<client> saveClient(@RequestBody client cleint){
        try{
            client clientGuardada=clientService.save(cleint);
            return ResponseEntity.created(new URI("/client/"+clientGuardada.getId())).body(clientGuardada);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}
