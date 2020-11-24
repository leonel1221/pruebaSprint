package com.example.demo.repositiry;

import com.example.demo.modelo.client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository <client, Long> {
}
