package com.example.first.Controllers;

import com.example.first.Entities.ClientEntity;
import com.example.first.Entities.FactureEntity;
import com.example.first.Entities.MedicamentEntity;
import com.example.first.Services.ClientService;
import com.example.first.Services.FactureService;
import com.example.first.Services.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("factures")
public class FactureController {
    @Autowired
    private FactureService fs;
    @GetMapping("/getfacture")
    public FactureEntity getfacture(@RequestParam Integer id){
        return fs.getFacture(id);
    }
    @PostMapping("/savefacture")
    public FactureEntity save(@RequestBody FactureEntity fe){
        return fs.save(fe);
    }
    @DeleteMapping("/deletefacture")
    public void deletefacture(@RequestParam Integer id){
        fs.deletefacture(id);

    }
    @PutMapping("/updatefacture")
    public FactureEntity updatefacture(@RequestBody FactureEntity fe){
        return fs.updatefacture(fe);
    }}