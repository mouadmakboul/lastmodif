package com.example.first.Services;

import com.example.first.Entities.ClientEntity;
import com.example.first.Entities.FactureEntity;
import com.example.first.Repositories.ClientRepo;
import com.example.first.Repositories.FactureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class FactureService {
    @Autowired
    private FactureRepo facturerepo;
    public FactureEntity getFacture(Integer ID){
        Optional<FactureEntity> facture =this.facturerepo.findById(ID);
        if(facture.isPresent())
            return facture.get();
        return null;

    }
    public FactureEntity save(FactureEntity facture){
        FactureEntity factureen =this.facturerepo.save(facture);
        return factureen;
    }
    public void deletefacture(Integer id) {
        facturerepo.deleteById(id);
    }
    public FactureEntity updatefacture(FactureEntity facture) {
        if (facturerepo.findById(facture.getIdFacture()).isPresent()) {
            return facturerepo.save(facture);
        }
        return null;
    }
}