package com.example.demo.rest;

import com.example.demo.modelo.client;
import com.example.demo.modelo.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/product/")
public class productRest {
    @Autowired
    private com.example.demo.service.productService productService;
    @GetMapping
    private ResponseEntity<List<product>> getAllProduct() {
        return ResponseEntity.ok(productService.findAll());
    }
    @PostMapping
    private ResponseEntity<product> saveProduct(@RequestBody product product){
        try{
            product productGuardada=productService.save(product);
            return ResponseEntity.created(new URI("/product/"+productGuardada.getId())).body(productGuardada);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }
}
