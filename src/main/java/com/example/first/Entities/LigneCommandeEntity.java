package com.example.first.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ligne_commande")
@NoArgsConstructor
@AllArgsConstructor
public class LigneCommandeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLigneCommande;

    private int quantity;

    @ManyToOne
    private FactureEntity facture;

    @ManyToOne
    private MedicamentEntity medicament;

    public int getIdLigneCommande() {
        return idLigneCommande;
    }
}