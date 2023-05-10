package com.example.first.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "medicament")
@NoArgsConstructor
@AllArgsConstructor
public class MedicamentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idMedicament;

    private String name;

    private String description;

    @ManyToOne
    private ClientEntity client;

    @OneToMany(mappedBy = "medicament")
    private List<LigneCommandeEntity> ligneCommandes;

    public int getIdMedicament() {
        return idMedicament;
    }
}