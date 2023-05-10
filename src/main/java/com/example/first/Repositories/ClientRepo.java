package com.example.first.Repositories;

import com.example.first.Entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<ClientEntity,Integer> {
}