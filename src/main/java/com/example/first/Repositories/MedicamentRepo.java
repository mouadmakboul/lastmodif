package com.example.first.Repositories;

import com.example.first.Entities.MedicamentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepo extends JpaRepository<MedicamentEntity,Integer> {
}