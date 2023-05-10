package com.example.first.Services;

import com.example.first.Entities.ClientEntity;
import com.example.first.Entities.FactureEntity;
import com.example.first.Entities.LigneCommandeEntity;
import com.example.first.Repositories.ClientRepo;
import com.example.first.Repositories.FactureRepo;
import com.example.first.Repositories.LigneCommandeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class LigneCommandeService {
    @Autowired
    private LigneCommandeRepo lcr;
    public LigneCommandeEntity getLignecommande(Integer ID){
        Optional<LigneCommandeEntity> lignecommande =this.lcr.findById(ID);
        if(lignecommande.isPresent())
            return lignecommande.get();
        return null;

    }
    public LigneCommandeEntity save(LigneCommandeEntity ligneCommande){
        LigneCommandeEntity lignecomm =this.lcr.save(ligneCommande);
        return lignecomm;
    }
    public void deletelignecommande(Integer id) {
        lcr.deleteById(id);
    }
    public LigneCommandeEntity update(LigneCommandeEntity ligneCommande) {
        if (lcr.findById(ligneCommande.getIdLigneCommande()).isPresent()) {
            return lcr.save(ligneCommande);
        }
        return null;
    }
}