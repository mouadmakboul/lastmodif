package com.example.first.Repositories;

import com.example.first.Entities.FactureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepo extends JpaRepository<FactureEntity,Integer> {
}