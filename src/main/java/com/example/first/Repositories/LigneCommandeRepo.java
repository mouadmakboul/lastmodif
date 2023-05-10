package com.example.first.Repositories;

import com.example.first.Entities.LigneCommandeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneCommandeRepo extends JpaRepository<LigneCommandeEntity,Integer> {
}