package com.example.first.Controllers;

import com.example.first.Entities.ClientEntity;
import com.example.first.Entities.FactureEntity;
import com.example.first.Entities.LigneCommandeEntity;
import com.example.first.Entities.MedicamentEntity;
import com.example.first.Services.ClientService;
import com.example.first.Services.FactureService;
import com.example.first.Services.LigneCommandeService;
import com.example.first.Services.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("lignecommandes")
public class LigneCommandeController {
    @Autowired
    private LigneCommandeService lcs;
    @GetMapping("/getlignecommande")
    public LigneCommandeEntity getlignecommande(@RequestParam Integer id){
        return lcs.getLignecommande(id);
    }
    @PostMapping("/savelignecommande")
    public LigneCommandeEntity save(@RequestBody LigneCommandeEntity lce){
        return lcs.save(lce);
    }
    @DeleteMapping("/deletelignecommande")
    public void lignecommande(@RequestParam Integer id){
        lcs.deletelignecommande(id);

    }
    @PutMapping("/updatefacture")
    public LigneCommandeEntity updatefacture(@RequestBody LigneCommandeEntity lce){
        return lcs.update(lce);
    }

}