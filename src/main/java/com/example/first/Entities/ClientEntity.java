package com.example.first.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "client")
@NoArgsConstructor
@AllArgsConstructor

public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idclient;
    private String prenom;
    private String nom;
    private String raisonsociale;
    private String mail;
    @OneToMany(mappedBy = "client")
    private List<FactureEntity> factures;
    @OneToMany(mappedBy = "client")
    private List<MedicamentEntity> medicaments;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRaisonsociale() {
        return raisonsociale;
    }

    public void setRaisonsociale(String raisonsociale) {
        this.raisonsociale = raisonsociale;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}