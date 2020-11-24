package com.example.demo.repositiry;

import com.example.demo.modelo.producer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface producerRepository extends JpaRepository <producer, Long> {
}
