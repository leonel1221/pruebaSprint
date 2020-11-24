package com.example.demo.repositiry;

import com.example.demo.modelo.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository <product, Long> {
}
