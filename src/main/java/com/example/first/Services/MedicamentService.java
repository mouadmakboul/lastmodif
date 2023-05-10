package com.example.first.Services;

import com.example.first.Entities.ClientEntity;
import com.example.first.Entities.FactureEntity;
import com.example.first.Entities.LigneCommandeEntity;
import com.example.first.Entities.MedicamentEntity;
import com.example.first.Repositories.ClientRepo;
import com.example.first.Repositories.FactureRepo;
import com.example.first.Repositories.LigneCommandeRepo;
import com.example.first.Repositories.MedicamentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class MedicamentService {
    @Autowired
    private MedicamentRepo mr;
    public MedicamentEntity getMedicament(Integer ID){
        Optional<MedicamentEntity> medicament =this.mr.findById(ID);
        if(medicament.isPresent())
            return medicament.get();
        return null;

    }
    public MedicamentEntity save(MedicamentEntity medicament){
        MedicamentEntity med =this.mr.save(medicament);
        return med;
    }
    public void deletemedicament(Integer id) {
        mr.deleteById(id);
    }
    public MedicamentEntity update(MedicamentEntity medicament) {
        if (mr.findById(medicament.getIdMedicament()).isPresent()) {
            return mr.save(medicament);
        }
        return null;
    }
}