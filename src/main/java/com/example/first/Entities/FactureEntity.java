package com.example.first.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "facture")
@NoArgsConstructor
@AllArgsConstructor
public class FactureEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFacture;

    private String num;

    private Date date;

    private int tva;
    @ManyToOne
    private ClientEntity client;
    @OneToMany(mappedBy = "facture")
    private List<LigneCommandeEntity> lignecommandes;

    public int getIdFacture() {
        return idFacture;
    }
}